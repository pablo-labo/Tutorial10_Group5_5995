package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.os.Trace;
import com.facebook.soloader.e;
import defpackage.akb;
import defpackage.ewa;
import defpackage.foa;
import defpackage.ioa;
import defpackage.p39;
import defpackage.vp4;
import defpackage.wp4;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final a a;

    public class a extends HashSet<String> {
    }

    static {
        new ReentrantReadWriteLock();
        a aVar = new a();
        aVar.add("libEGL.so");
        aVar.add("libGLESv2.so");
        aVar.add("libGLESv3.so");
        aVar.add("libOpenSLES.so");
        aVar.add("libandroid.so");
        aVar.add("libc.so");
        aVar.add("libdl.so");
        aVar.add("libjnigraphics.so");
        aVar.add("liblog.so");
        aVar.add("libm.so");
        aVar.add("libstdc++.so");
        aVar.add("libz.so");
        a = aVar;
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public static String[] a(String str, vp4 vp4Var) {
        if (SoLoader.a) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        foa[] foaVarArr = ioa.a.get();
        int i = 0;
        if (foaVarArr != null) {
            for (foa foaVar : foaVarArr) {
                foaVar.g();
            }
        }
        try {
            try {
                return e.a(vp4Var);
            } catch (e.a e) {
                throw ewa.r(str, e);
            } catch (Error e2) {
                throw e2;
            } catch (RuntimeException e3) {
                throw e3;
            }
        } finally {
            foa[] foaVarArr2 = ioa.a.get();
            if (foaVarArr2 != null) {
                int length = foaVarArr2.length;
                while (i < length) {
                    foaVarArr2[i].c();
                    i++;
                }
            }
            if (SoLoader.a) {
                Trace.endSection();
            }
        }
    }

    public static void b(String str, wp4 wp4Var, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrA = a(str, wp4Var);
        StringBuilder sbM = akb.m("Loading ", str, "'s dependencies: ");
        sbM.append(Arrays.toString(strArrA));
        p39.a(sbM.toString());
        for (String str2 : strArrA) {
            if (!str2.startsWith("/") && !a.contains(str2)) {
                SoLoader.k(str2, i, threadPolicy);
            }
        }
    }
}
