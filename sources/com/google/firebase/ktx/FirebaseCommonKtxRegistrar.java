package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.c5g;
import defpackage.jg2;
import defpackage.l7d;
import defpackage.mw8;
import defpackage.my3;
import defpackage.n71;
import defpackage.pi3;
import defpackage.sy3;
import defpackage.u63;
import defpackage.uf2;
import defpackage.uh1;
import defpackage.y03;
import defpackage.y8c;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Luf2;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
@sy3
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements jg2 {
        public static final a<T> a = new a<>();

        @Override // defpackage.jg2
        public final Object d(l7d l7dVar) {
            Object objC = l7dVar.c(new y8c<>(n71.class, Executor.class));
            objC.getClass();
            return pi3.e((Executor) objC);
        }
    }

    public static final class b<T> implements jg2 {
        public static final b<T> a = new b<>();

        @Override // defpackage.jg2
        public final Object d(l7d l7dVar) {
            Object objC = l7dVar.c(new y8c<>(mw8.class, Executor.class));
            objC.getClass();
            return pi3.e((Executor) objC);
        }
    }

    public static final class c<T> implements jg2 {
        public static final c<T> a = new c<>();

        @Override // defpackage.jg2
        public final Object d(l7d l7dVar) {
            Object objC = l7dVar.c(new y8c<>(uh1.class, Executor.class));
            objC.getClass();
            return pi3.e((Executor) objC);
        }
    }

    public static final class d<T> implements jg2 {
        public static final d<T> a = new d<>();

        @Override // defpackage.jg2
        public final Object d(l7d l7dVar) {
            Object objC = l7dVar.c(new y8c<>(c5g.class, Executor.class));
            objC.getClass();
            return pi3.e((Executor) objC);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uf2<?>> getComponents() {
        uf2.a aVarA = uf2.a(new y8c(n71.class, y03.class));
        aVarA.a(new my3((y8c<?>) new y8c(n71.class, Executor.class), 1, 0));
        aVarA.f = a.a;
        uf2 uf2VarB = aVarA.b();
        uf2.a aVarA2 = uf2.a(new y8c(mw8.class, y03.class));
        aVarA2.a(new my3((y8c<?>) new y8c(mw8.class, Executor.class), 1, 0));
        aVarA2.f = b.a;
        uf2 uf2VarB2 = aVarA2.b();
        uf2.a aVarA3 = uf2.a(new y8c(uh1.class, y03.class));
        aVarA3.a(new my3((y8c<?>) new y8c(uh1.class, Executor.class), 1, 0));
        aVarA3.f = c.a;
        uf2 uf2VarB3 = aVarA3.b();
        uf2.a aVarA4 = uf2.a(new y8c(c5g.class, y03.class));
        aVarA4.a(new my3((y8c<?>) new y8c(c5g.class, Executor.class), 1, 0));
        aVarA4.f = d.a;
        return u63.a0(uf2VarB, uf2VarB2, uf2VarB3, aVarA4.b());
    }
}
