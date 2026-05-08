package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class cob implements qo3 {
    public static final a a = new a();
    public static b b = b.a;

    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("NONE", 0);
            a = bVar;
            b bVar2 = new b("IN_PROGRESS", 1);
            b = bVar2;
            b bVar3 = new b("COMPLETE", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    @Override // defpackage.qo3
    public final void onStart(zv8 zv8Var) {
        zv8Var.getClass();
        c49.a("cob", "App enter foreground", new Object[0]);
        try {
            HashMap map = new HashMap();
            map.put("isForeground", Boolean.TRUE);
            lla.b("SnowplowLifecycleTracking", map);
        } catch (Exception e) {
            c49.b("cob", "Method onEnterForeground raised an exception: %s", e);
        }
    }

    @Override // defpackage.qo3
    public final void onStop(zv8 zv8Var) {
        c49.a("cob", "App enter background", new Object[0]);
        try {
            HashMap map = new HashMap();
            map.put("isForeground", Boolean.FALSE);
            lla.b("SnowplowLifecycleTracking", map);
        } catch (Exception e) {
            c49.b("cob", "Method onEnterBackground raised an exception: %s", e);
        }
    }
}
