package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class cxe {
    public final HashMap<String, String> a;

    public cxe(Context context, dxe dxeVar) {
        DisplayMetrics displayMetrics;
        jie jieVar;
        context.getClass();
        HashMap<String, String> map = new HashMap<>();
        this.a = map;
        String id = Calendar.getInstance().getTimeZone().getID();
        if (id != null) {
            map.put("tz", id);
        }
        String displayLanguage = Locale.getDefault().getDisplayLanguage();
        if (displayLanguage != null) {
            map.put("lang", displayLanguage);
        }
        if (wl7.b(Boolean.valueOf(dxeVar.i()), Boolean.TRUE)) {
            int i = context.getResources().getDisplayMetrics().widthPixels;
            int i2 = context.getResources().getDisplayMetrics().heightPixels;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            map.put("res", sb.toString());
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
                    currentWindowMetrics.getClass();
                    jieVar = new jie(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
                } else {
                    Object systemService = context.getSystemService("window");
                    WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                    Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
                    if (defaultDisplay != null) {
                        displayMetrics = new DisplayMetrics();
                        defaultDisplay.getRealMetrics(displayMetrics);
                    } else {
                        displayMetrics = Resources.getSystem().getDisplayMetrics();
                    }
                    jieVar = new jie(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                a(jieVar);
            } catch (Throwable unused) {
                c49.b("cxe", "Failed to set default screen resolution.", new Object[0]);
            }
        }
        String strJ = dxeVar.j();
        if (strJ != null) {
            this.a.put("uid", strJ);
        }
        String strE = dxeVar.e();
        if (strE != null) {
            this.a.put("tnuid", strE);
        }
        String strB = dxeVar.b();
        if (strB != null) {
            this.a.put("duid", strB);
        }
        String strK = dxeVar.k();
        if (strK != null) {
            this.a.put("ua", strK);
        }
        String strC = dxeVar.c();
        if (strC != null) {
            this.a.put("ip", strC);
        }
        String strH = dxeVar.h();
        if (strH != null) {
            this.a.put("tz", strH);
        }
        String strD = dxeVar.d();
        if (strD != null) {
            this.a.put("lang", strD);
        }
        jie jieVarF = dxeVar.f();
        if (jieVarF != null) {
            a(jieVarF);
        }
        jie jieVarG = dxeVar.g();
        if (jieVarG != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jieVarG.a);
            sb2.append('x');
            sb2.append(jieVarG.b);
            this.a.put("vp", sb2.toString());
        }
        Integer numA = dxeVar.a();
        if (numA != null) {
            this.a.put("cd", Integer.valueOf(numA.intValue()).toString());
        }
        c49.e("cxe", "Subject created successfully.", new Object[0]);
    }

    public final void a(jie jieVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jieVar.a);
        sb.append('x');
        sb.append(jieVar.b);
        this.a.put("res", sb.toString());
    }
}
