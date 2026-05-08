package com.facebook.react.views.scroll;

import defpackage.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static final /* synthetic */ g[] V;
    public static final a a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;

    public static final class a {
        public static String a(g gVar) {
            gVar.getClass();
            int iOrdinal = gVar.ordinal();
            if (iOrdinal == 0) {
                return "topScrollBeginDrag";
            }
            if (iOrdinal == 1) {
                return "topScrollEndDrag";
            }
            if (iOrdinal == 2) {
                return "topScroll";
            }
            if (iOrdinal == 3) {
                return "topMomentumScrollBegin";
            }
            if (iOrdinal == 4) {
                return "topMomentumScrollEnd";
            }
            l.g();
            return null;
        }
    }

    static {
        g gVar = new g("BEGIN_DRAG", 0);
        b = gVar;
        g gVar2 = new g("END_DRAG", 1);
        c = gVar2;
        g gVar3 = new g("SCROLL", 2);
        d = gVar3;
        g gVar4 = new g("MOMENTUM_BEGIN", 3);
        e = gVar4;
        g gVar5 = new g("MOMENTUM_END", 4);
        f = gVar5;
        V = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
        a = new a();
    }

    public g() {
        throw null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) V.clone();
    }
}
