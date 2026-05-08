package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.CodedException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class rqg {
    public final String a;
    public final ed b;
    public final Class<? extends View> c;
    public final Map<String, uf0> d;
    public final Function1<View, j6g> e;
    public final c00 f;
    public final Function1<View, j6g> g;
    public final List<s81> h;
    public final List<String> i;

    public rqg(String str, ed edVar, Class cls, LinkedHashMap linkedHashMap, Function1 function1, c00 c00Var, Function1 function12, List list) {
        linkedHashMap.getClass();
        this.a = str;
        this.b = edVar;
        this.c = cls;
        this.d = linkedHashMap;
        this.e = function1;
        this.f = c00Var;
        this.g = function12;
        this.h = list;
        this.i = z92.z1(linkedHashMap.keySet());
    }

    public static void a(View view, CodedException codedException) {
        NativeModulesProxy nativeModulesProxyM;
        uo7 uo7Var;
        view.getClass();
        Context context = view.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null || (nativeModulesProxyM = q92.m(reactContext)) == null || (uo7Var = (uo7) nativeModulesProxyM.getKotlinInteropModuleRegistry().a.k.getValue()) == null) {
            return;
        }
        String message = codedException.getMessage();
        if (message == null) {
            message = codedException.toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        uo7Var.d("ExpoModulesCoreJSLogger.onNewError", bundle);
    }
}
