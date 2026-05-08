package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import com.swmansion.gesturehandler.core.g;
import defpackage.xmd;

/* JADX INFO: loaded from: classes3.dex */
public final class j {
    public final a a;
    public float b;
    public float c;
    public final boolean d;
    public final boolean e;
    public float f;
    public float g;
    public float h;
    public long i;
    public long j;
    public boolean k;
    public final int l;
    public float m;
    public float n;
    public int o = 0;
    public final GestureDetector p;
    public boolean q;

    public interface a {
        void a(j jVar);

        void b(j jVar);

        void c(j jVar);
    }

    public j(Context context, g.b bVar) {
        this.a = bVar;
        this.l = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            this.d = true;
            if (this.p == null) {
                this.p = new GestureDetector(context, new xmd(this), null);
            }
        }
        if (i > 22) {
            this.e = true;
        }
    }

    public final boolean a() {
        return this.o != 0;
    }
}
