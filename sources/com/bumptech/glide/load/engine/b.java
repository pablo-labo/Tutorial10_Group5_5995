package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.f;
import defpackage.fx9;
import defpackage.ke3;
import defpackage.kg8;
import defpackage.xd3;
import defpackage.xe3;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c, ke3.a<Object> {
    public int V;
    public volatile fx9.a<?> W;
    public File X;
    public final List<kg8> a;
    public final d<?> b;
    public final c.a c;
    public int d = -1;
    public kg8 e;
    public List<fx9<File, ?>> f;

    public b(List<kg8> list, d<?> dVar, c.a aVar) {
        this.a = list;
        this.b = dVar;
        this.c = aVar;
    }

    @Override // com.bumptech.glide.load.engine.c
    public final boolean a() {
        while (true) {
            List<fx9<File, ?>> list = this.f;
            boolean z = false;
            if (list != null && this.V < list.size()) {
                this.W = null;
                while (!z && this.V < this.f.size()) {
                    List<fx9<File, ?>> list2 = this.f;
                    int i = this.V;
                    this.V = i + 1;
                    fx9<File, ?> fx9Var = list2.get(i);
                    File file = this.X;
                    d<?> dVar = this.b;
                    this.W = fx9Var.a(file, dVar.e, dVar.f, dVar.i);
                    if (this.W != null && this.b.c(this.W.c.a()) != null) {
                        this.W.c.d(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            kg8 kg8Var = this.a.get(this.d);
            d<?> dVar2 = this.b;
            File fileA = ((f.c) dVar2.h).a().a(new xd3(kg8Var, dVar2.n));
            this.X = fileA;
            if (fileA != null) {
                this.e = kg8Var;
                this.f = this.b.c.a().f(fileA);
                this.V = 0;
            }
        }
    }

    @Override // ke3.a
    public final void c(Exception exc) {
        this.c.e(this.e, exc, this.W.c, xe3.c);
    }

    @Override // com.bumptech.glide.load.engine.c
    public final void cancel() {
        fx9.a<?> aVar = this.W;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // ke3.a
    public final void f(Object obj) {
        this.c.f(this.e, obj, this.W.c, xe3.c, this.e);
    }
}
