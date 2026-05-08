package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ca6 extends d4a {

    public static final class a implements Function1<zle, d4a> {
        public final /* synthetic */ Function1<Object, j6g> a;
        public final /* synthetic */ Function1<Object, j6g> b;

        public a(Function1<Object, j6g> function1, Function1<Object, j6g> function12) {
            this.a = function1;
            this.b = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final d4a invoke(zle zleVar) {
            long j;
            zle zleVar2 = zleVar;
            synchronized (ame.c) {
                j = ame.e;
                ame.e = 1 + j;
            }
            return new d4a(j, zleVar2, this.a, this.b);
        }
    }

    public static final class b implements Function1<zle, qqc> {
        public final /* synthetic */ Function1<Object, j6g> a;

        public b(Function1<Object, j6g> function1) {
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final qqc invoke(zle zleVar) {
            long j;
            zle zleVar2 = zleVar;
            synchronized (ame.c) {
                j = ame.e;
                ame.e = 1 + j;
            }
            return new qqc(j, zleVar2, this.a);
        }
    }

    @Override // defpackage.d4a
    public final d4a C(Function1<Object, j6g> function1, Function1<Object, j6g> function12) {
        return (d4a) ((wle) ame.e(new jw0(new a(function1, function12), 2)));
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void c() {
        synchronized (ame.c) {
            o();
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void k() {
        ee3.A();
        throw null;
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void l() {
        ee3.A();
        throw null;
    }

    @Override // defpackage.d4a, defpackage.wle
    public final void m() {
        ame.e(ame.a);
    }

    @Override // defpackage.d4a, defpackage.wle
    public final wle u(Function1<Object, j6g> function1) {
        return (qqc) ((wle) ame.e(new jw0(new b(function1), 2)));
    }

    @Override // defpackage.d4a
    public final xle w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
