package com.indeed.android.uiplugin.oneoff;

import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import com.indeed.android.uiplugin.oneoff.JSONCallbackError;
import defpackage.bt;
import defpackage.cr8;
import defpackage.fwc;
import defpackage.vo7;
import defpackage.wz4;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final a a = new a();
    public static final ConcurrentHashMap<String, vo7> b = new ConcurrentHashMap<>();

    public final synchronized void a(vo7 vo7Var) {
        String str = vo7Var.a;
        if (str.length() == 0) {
            throw new JSONCallbackError.InvalidCallbackId(str);
        }
        ConcurrentHashMap<String, vo7> concurrentHashMap = b;
        if (concurrentHashMap.containsKey(str)) {
            throw new JSONCallbackError.CallbackAlreadyExists(str);
        }
        ((JSTBroadcast) cr8.p(JSTBroadcast.class)).subscribe(fwc.a.b(JSTBroadcastEvent.JsonCallback.class), new wz4(str, 3), new bt(vo7Var, 19));
        concurrentHashMap.put(str, vo7Var);
    }

    public final synchronized void b(String str, JsonObject jsonObject) {
        if (str.length() == 0) {
            throw new JSONCallbackError.InvalidCallbackId(str);
        }
        if (b.remove(str) == null) {
            throw new JSONCallbackError.CallbackNotFound(str);
        }
        ((JSTBroadcast) cr8.p(JSTBroadcast.class)).dispatch(new JSTBroadcastEvent.JsonCallback(str, jsonObject));
    }
}
