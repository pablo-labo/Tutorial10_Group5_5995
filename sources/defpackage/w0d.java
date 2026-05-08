package defpackage;

import androidx.paging.SingleRunner;
import defpackage.r0d;
import defpackage.x6;
import defpackage.xz8;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", l = {314}, m = "invokeSuspend")
public final class w0d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ s0d<Object, Object> this$0;

    @uh3(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", l = {321}, m = "invokeSuspend")
    public static final class a extends c1f implements Function1<lu2<? super j6g>, Object> {
        final /* synthetic */ huc $launchAppendPrepend;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ s0d<Object, Object> this$0;

        /* JADX INFO: renamed from: w0d$a$a, reason: collision with other inner class name */
        public static final class C0464a extends mj8 implements Function1<x6<Object, Object>, Boolean> {
            final /* synthetic */ r0d.b $loadResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0464a(r0d.b.C0404b c0404b) {
                super(1);
                this.$loadResult = c0404b;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(x6<Object, Object> x6Var) {
                x6<Object, Object> x6Var2 = x6Var;
                x6Var2.getClass();
                zz8 zz8Var = zz8.a;
                x6Var2.a(zz8Var);
                boolean z = ((r0d.b.C0404b) this.$loadResult).a;
                zz8 zz8Var2 = zz8.c;
                zz8 zz8Var3 = zz8.b;
                if (z) {
                    x6.a aVar = x6.a.b;
                    x6Var2.d(zz8Var, aVar);
                    x6Var2.d(zz8Var3, aVar);
                    x6Var2.d(zz8Var2, aVar);
                    x6Var2.c.clear();
                } else {
                    x6.a aVar2 = x6.a.a;
                    x6Var2.d(zz8Var3, aVar2);
                    x6Var2.d(zz8Var2, aVar2);
                }
                x6Var2.e(zz8Var3, null);
                x6Var2.e(zz8Var2, null);
                return Boolean.valueOf(x6Var2.c() != null);
            }
        }

        public static final class b extends mj8 implements Function1<x6<Object, Object>, Boolean> {
            final /* synthetic */ r0d.b $loadResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r0d.b.a aVar) {
                super(1);
                this.$loadResult = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(x6<Object, Object> x6Var) {
                x6<Object, Object> x6Var2 = x6Var;
                x6Var2.getClass();
                zz8 zz8Var = zz8.a;
                x6Var2.a(zz8Var);
                x6Var2.e(zz8Var, new xz8.a(((r0d.b.a) this.$loadResult).a));
                return Boolean.valueOf(x6Var2.c() != null);
            }
        }

        public static final class c extends mj8 implements Function1<x6<Object, Object>, s2b<Object, Object>> {
            public static final c a = new c(1);

            @Override // kotlin.jvm.functions.Function1
            public final s2b<Object, Object> invoke(x6<Object, Object> x6Var) {
                x6.b<Object, Object> next;
                x6<Object, Object> x6Var2 = x6Var;
                x6Var2.getClass();
                Iterator<x6.b<Object, Object>> it = x6Var2.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.a == zz8.a) {
                        break;
                    }
                }
                x6.b<Object, Object> bVar = next;
                if (bVar != null) {
                    return bVar.b;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0d<Object, Object> s0dVar, huc hucVar, lu2<? super a> lu2Var) {
            super(1, lu2Var);
            this.this$0 = s0dVar;
            this.$launchAppendPrepend = hucVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return new a(this.this$0, this.$launchAppendPrepend, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super j6g> lu2Var) {
            return ((a) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            s0d<Object, Object> s0dVar;
            huc hucVar;
            boolean zBooleanValue;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                s2b<Object, Object> s2bVar = (s2b) this.this$0.c.b(c.a);
                if (s2bVar != null) {
                    s0d<Object, Object> s0dVar2 = this.this$0;
                    huc hucVar2 = this.$launchAppendPrepend;
                    r0d<Object, Object> r0dVar = s0dVar2.b;
                    this.L$0 = s0dVar2;
                    this.L$1 = hucVar2;
                    this.label = 1;
                    obj = r0dVar.load(zz8.a, s2bVar, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                    s0dVar = s0dVar2;
                    hucVar = hucVar2;
                }
                return j6g.a;
            }
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hucVar = (huc) this.L$1;
            s0dVar = (s0d) this.L$0;
            r7d.b(obj);
            r0d.b bVar = (r0d.b) obj;
            if (bVar instanceof r0d.b.C0404b) {
                zBooleanValue = ((Boolean) s0dVar.c.b(new C0464a((r0d.b.C0404b) bVar))).booleanValue();
            } else {
                if (!(bVar instanceof r0d.b.a)) {
                    l.g();
                    return null;
                }
                zBooleanValue = ((Boolean) s0dVar.c.b(new b((r0d.b.a) bVar))).booleanValue();
            }
            hucVar.element = zBooleanValue;
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0d(s0d<Object, Object> s0dVar, lu2<? super w0d> lu2Var) {
        super(2, lu2Var);
        this.this$0 = s0dVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new w0d(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((w0d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        huc hucVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            hucVar = new huc();
            s0d<Object, Object> s0dVar = this.this$0;
            SingleRunner singleRunner = s0dVar.d;
            a aVar = new a(s0dVar, hucVar, null);
            this.L$0 = hucVar;
            this.label = 1;
            Object objA = singleRunner.a(2, aVar, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hucVar = (huc) this.L$0;
            r7d.b(obj);
        }
        if (hucVar.element) {
            s0d<Object, Object> s0dVar2 = this.this$0;
            u63.Y(s0dVar2.a, null, null, new v0d(s0dVar2, null), 3);
        }
        return j6g.a;
    }
}
