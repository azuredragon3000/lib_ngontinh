/*
 * Copyright 2020 Google LLC. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.myapp.lib_ngontinh;

import android.app.Application;

import com.myapp.mylibrary.DB.DatabaseBoiPhuongDong;
import com.myapp.mylibrary.DB.DatabaseBoiPhuongTay;
import com.myapp.mylibrary.DB.DatabaseCungMang;
import com.myapp.mylibrary.DB.DatabaseNamSinh;
import com.myapp.mylibrary.DB.DatabaseNgonTinh;
import com.myapp.mylibrary.billing.BillingClientLifecycle;
import com.myapp.mylibrary.boitinhyeu.DatabaseBoiTinhYeuCHD;
import com.myapp.mylibrary.boitinhyeu.DatabaseBoiTinhYeuPD;


/**
 * Android Application class. Used for accessing singletons.
 */
public class SubApp extends Application {

    public  String DB_PATH= "/data/data/com.myapp.lib_ngontinh/databases/";
    public  String DATABASE_BOIPHUONGDONG = "datatonghop.db";
    public  String DATABASE_NAMSINH = "tuvitrondoi.sqlite";
    public  String DATABASE_BOITINHYEUPD = "boiphuongdong_bty.db";
    public  String DATABASE_BOITINHYEUCHD = "cunghoangdao.db";

    public DatabaseBoiPhuongDong getDatabaseBoiPhuongDong(){
        return DatabaseBoiPhuongDong.getInstance(this,DB_PATH,DATABASE_BOIPHUONGDONG);
    }

    public DatabaseBoiTinhYeuPD getDatabaseBoiPhuongDongBTY(){
        return DatabaseBoiTinhYeuPD.getInstance(this,DB_PATH,DATABASE_BOITINHYEUPD);
    }

    public BillingClientLifecycle getBillingClientLifecycle() {
        return BillingClientLifecycle.getInstance(this);
    }

    public DatabaseBoiTinhYeuCHD getDatabaseBoiCHD(){
        return DatabaseBoiTinhYeuCHD.getInstance(this,DB_PATH,DATABASE_BOITINHYEUCHD);
    }

    public DatabaseBoiPhuongTay getDatabaseBoiPhuongTay(){
        return DatabaseBoiPhuongTay.getInstance(this,DB_PATH,DATABASE_BOIPHUONGDONG);
    }

    public DatabaseCungMang getDatabaseCungMang(){
        return DatabaseCungMang.getInstance(this,DB_PATH,DATABASE_BOIPHUONGDONG);
    }

    public DatabaseNgonTinh getDatabaseNgonTinh(){
        return DatabaseNgonTinh.getInstance(this,DB_PATH,DATABASE_BOIPHUONGDONG);
    }

    public DatabaseNamSinh getDatabaseNamSinh(){
        return DatabaseNamSinh.getInstance(this,DB_PATH,DATABASE_NAMSINH);
    }
   /* public BillingClientLifecycle getBillingClientLifecycle() {
        return BillingClientLifecycle.getInstance(this);
    }

    public DatabaseTruyenTinhYeu getDatabaseTruyenTinhYeu(){
        return DatabaseTruyenTinhYeu.getInstance(this);
    }
    public DatabaseTuViManager1 getDatabaseTuViManager1(){
        return DatabaseTuViManager1.getInstance(this);
    }
    public DatabaseTuViManager2 getDatabaseTuviManager2(){
        return DatabaseTuViManager2.getInstance(this);
    }
    public FirebaseUtiti getDatabaseFirebase(){
        return FirebaseUtiti.getInstance(this);
    }

    public DatabaseCungHoangDao getDatabaseCungHoangDao() {
        return DatabaseCungHoangDao.getInstance(this);
    }*/



   /* public DatabaseBoiPhuongDong getDatabaseBoiPhuongDong() {
        return DatabaseBoiPhuongDong.getInstance(this);
    }*/
}
