package com.swufe.finalproject.ChangeRate;

import android.os.Handler;
import android.os.Message;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Runable implements Runnable{
    Handler handler = null;

    public void setHandler(Handler handler)
    {
        this.handler = handler;
    }
    @Override
    public void run() {
        ArrayList<HashMap<String, String>> list = null;
        try {
            Document document = Jsoup.connect("https://www.boc.cn/sourcedb/whpj/index.html").get();
            Elements tebles =  document.getElementsByTag("table");
            Element table =  tebles.get(1);
            Elements trs = table.getElementsByTag("tr");
            list = new ArrayList<>();
            for(int i = 1 ; i < trs.size() ; i++)
            {
                HashMap<String, String> map = new HashMap<>();
                Element tr = trs.get(i);
                Elements tds = tr.getElementsByTag("td");
                Element td1 = tds.get(0);
                Element td2 = tds.get(1);
                map.put("country", td1.text());
                map.put("value", td2.text());
                list.add(map);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Message msg = handler.obtainMessage();
        msg.what = 6;
        msg.obj = list;
        handler.sendMessage(msg);
    }
}
