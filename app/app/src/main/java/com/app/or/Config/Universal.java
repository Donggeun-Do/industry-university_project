package com.app.or.Config;

import com.app.or.Hide.Abbr;
import com.app.or.Hide.AbbrInterFace;
import com.app.or.Interface.SecurityInterface;
import com.app.or.Universal.HttpsHelper;
import com.app.or.Universal.ImageHelper;
import com.app.or.Universal.ReviewHelper;
import com.app.or.Universal.Security;

public class Universal {

    public static AbbrInterFace abbr;
    public static HttpsHelper httpsHelper;
    public static ImageHelper imageHelper;
    public static ReviewHelper reviewHelper;
    public static SecurityInterface security;


    public Universal() {
        security = new Security();
        abbr = new Abbr();
        httpsHelper = new HttpsHelper();
        imageHelper = new ImageHelper();
        reviewHelper = new ReviewHelper();
    }


}
