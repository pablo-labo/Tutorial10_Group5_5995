package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.a;
import com.bumptech.glide.load.engine.f;
import defpackage.au8;
import defpackage.i4d;
import defpackage.kt0;
import defpackage.kz5;
import defpackage.l96;
import defpackage.n4d;
import defpackage.n96;
import defpackage.psf;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {
    public static final kz5 j = new kz5();
    public final kt0 a;
    public final n96 b;
    public final a.InterfaceC0113a c;
    public final List<i4d<Object>> d;
    public final Map<Class<?>, psf<?, ?>> e;
    public final f f;
    public final l96 g;
    public final int h;
    public n4d i;

    public c(Context context, kt0 kt0Var, au8 au8Var, a.InterfaceC0113a interfaceC0113a, Map map, List list, f fVar, l96 l96Var, int i) {
        super(context.getApplicationContext());
        this.a = kt0Var;
        this.c = interfaceC0113a;
        this.d = list;
        this.e = map;
        this.f = fVar;
        this.g = l96Var;
        this.h = i;
        this.b = new n96(au8Var);
    }

    public final Registry a() {
        return (Registry) this.b.get();
    }
}
