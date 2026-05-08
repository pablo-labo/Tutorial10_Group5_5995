package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class spg<T extends View> {
    public final yd8<T> a;
    public final xp8 b;
    public final String c;
    public final LinkedHashMap d;
    public Function1<? super View, j6g> e;
    public Function1<? super View, j6g> f;
    public c00 g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public spg(yd8 yd8Var, xp8 xp8Var, pwf pwfVar) {
        yd8Var.getClass();
        this.a = yd8Var;
        this.b = xp8Var;
        this.c = yd8Var.r();
        this.d = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    public final rqg a() {
        LinkedHashMap linkedHashMap = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            z0f z0fVar = ((xu0) entry.getValue()).c;
            if (z0fVar == null) {
                l5.q("Required value was null.");
                return null;
            }
            linkedHashMap2.put(key, z0fVar);
        }
        LinkedHashMap linkedHashMapC0 = lc9.c0(this.h, linkedHashMap2);
        Iterator it = linkedHashMapC0.entrySet().iterator();
        while (it.hasNext()) {
            s81 s81Var = (s81) ((Map.Entry) it.next()).getValue();
            s81Var.getClass();
            s81Var.g = cac.a;
            s81Var.d = this.b;
            s81Var.c = true;
        }
        return new rqg(this.c, new ed(this, 14), jh2.p(this.a), this.d, this.e, this.g, this.f, z92.z1(linkedHashMapC0.values()));
    }

    public final LinkedHashMap b() {
        return this.h;
    }

    public final LinkedHashMap c() {
        return this.d;
    }

    public final View d(Context context, gk0 gk0Var, Throwable th) {
        StringBuilder sb = new StringBuilder("Couldn't create view of type ");
        yd8<T> yd8Var = this.a;
        sb.append(yd8Var);
        Log.e("ExpoModulesCore", sb.toString(), th);
        uo7 uo7Var = (uo7) gk0Var.k.getValue();
        if (uo7Var != null) {
            CodedException unexpectedException = th instanceof CodedException ? (CodedException) th : null;
            if (unexpectedException == null) {
                unexpectedException = new UnexpectedException(th);
            }
            String message = unexpectedException.getMessage();
            if (message == null) {
                message = unexpectedException.toString();
            }
            Bundle bundle = new Bundle();
            bundle.putString("message", message);
            uo7Var.d("ExpoModulesCoreJSLogger.onNewError", bundle);
        }
        if (ViewGroup.class.isAssignableFrom(jh2.p(yd8Var))) {
            context.getClass();
            return new ow4(context);
        }
        context.getClass();
        return new nx4(context);
    }
}
