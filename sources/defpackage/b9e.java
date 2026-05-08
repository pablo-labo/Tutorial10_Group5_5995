package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import defpackage.rjb;
import io.jsonwebtoken.JwtParser;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class b9e implements a9e {
    public static final c e = new c();

    @Deprecated
    public static final ojb f = ojh.x(z8e.a, new okc(b.a));
    public final Context a;
    public final v03 b;
    public final AtomicReference<cg5> c;
    public final f d;

    @uh3(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {81}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        /* JADX INFO: renamed from: b9e$a$a, reason: collision with other inner class name */
        public static final class C0090a<T> implements wi5 {
            public final /* synthetic */ b9e a;

            public C0090a(b9e b9eVar) {
                this.a = b9eVar;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                this.a.c.set((cg5) obj);
                return j6g.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return b9e.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                b9e b9eVar = b9e.this;
                f fVar = b9eVar.d;
                C0090a c0090a = new C0090a(b9eVar);
                this.label = 1;
                Object objE = fVar.e(c0090a, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<CorruptionException, rjb> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final rjb invoke(CorruptionException corruptionException) {
            CorruptionException corruptionException2 = corruptionException;
            corruptionException2.getClass();
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + wnb.b() + JwtParser.SEPARATOR_CHAR, corruptionException2);
            return new s3a(1, true);
        }
    }

    public static final class c {
        public static final /* synthetic */ qf8<Object>[] a = {fwc.a.h(new n4c(c.class))};
    }

    public static final class d {
        public static final rjb.a<String> a = new rjb.a<>("session_id");
    }

    @uh3(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {75}, m = "invokeSuspend")
    public static final class e extends c1f implements wu5<wi5<? super rjb>, Throwable, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.L$1);
                s3a s3aVar = new s3a(1, true);
                this.L$0 = null;
                this.label = 1;
                Object objA = wi5Var.a(s3aVar, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }

        @Override // defpackage.wu5
        public final Object q(wi5<? super rjb> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
            e eVar = new e(3, lu2Var);
            eVar.L$0 = wi5Var;
            eVar.L$1 = th;
            return eVar.invokeSuspend(j6g.a);
        }
    }

    public static final class f implements vi5<cg5> {
        public final /* synthetic */ nj5 a;
        public final /* synthetic */ b9e b;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ wi5 a;

            /* JADX INFO: renamed from: b9e$f$a$a, reason: collision with other inner class name */
            @uh3(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {224}, m = "emit")
            public static final class C0091a extends pu2 {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public C0091a(lu2 lu2Var) {
                    super(lu2Var);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(wi5 wi5Var, b9e b9eVar) {
                this.a = wi5Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // defpackage.wi5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, defpackage.lu2 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof b9e.f.a.C0091a
                    if (r0 == 0) goto L13
                    r0 = r6
                    b9e$f$a$a r0 = (b9e.f.a.C0091a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    b9e$f$a$a r0 = new b9e$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.result
                    int r1 = r0.label
                    r2 = 1
                    if (r1 == 0) goto L2c
                    if (r1 != r2) goto L25
                    defpackage.r7d.b(r6)
                    goto L4d
                L25:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L2c:
                    defpackage.r7d.b(r6)
                    rjb r5 = (defpackage.rjb) r5
                    b9e$c r6 = defpackage.b9e.e
                    cg5 r6 = new cg5
                    rjb$a<java.lang.String> r1 = b9e.d.a
                    java.lang.Object r5 = r5.b(r1)
                    java.lang.String r5 = (java.lang.String) r5
                    r6.<init>(r5)
                    r0.label = r2
                    wi5 r4 = r4.a
                    java.lang.Object r4 = r4.a(r6, r0)
                    g13 r5 = defpackage.g13.a
                    if (r4 != r5) goto L4d
                    return r5
                L4d:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: b9e.f.a.a(java.lang.Object, lu2):java.lang.Object");
            }
        }

        public f(nj5 nj5Var, b9e b9eVar) {
            this.a = nj5Var;
            this.b = b9eVar;
        }

        @Override // defpackage.vi5
        public final Object e(wi5<? super cg5> wi5Var, lu2 lu2Var) throws Throwable {
            Object objE = this.a.e(new a(wi5Var, this.b), lu2Var);
            return objE == g13.a ? objE : j6g.a;
        }
    }

    @uh3(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {87}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $sessionId;
        int label;

        @uh3(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<s3a, lu2<? super j6g>, Object> {
            final /* synthetic */ String $sessionId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$sessionId = str;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.$sessionId, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s3a s3aVar, lu2<? super j6g> lu2Var) {
                return ((a) create(s3aVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                s3a s3aVar = (s3a) this.L$0;
                String str = this.$sessionId;
                s3aVar.getClass();
                rjb.a<String> aVar = d.a;
                aVar.getClass();
                s3aVar.c(aVar, str);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$sessionId = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return b9e.this.new g(this.$sessionId, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                c cVar = b9e.e;
                Context context = b9e.this.a;
                cVar.getClass();
                if3 if3Var = (if3) b9e.f.a(c.a[0], context);
                a aVar = new a(this.$sessionId, null);
                this.label = 1;
                Object objA = if3Var.a(new vjb(aVar, null), this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public b9e(Context context, v03 v03Var) {
        context.getClass();
        this.a = context;
        this.b = v03Var;
        this.c = new AtomicReference<>();
        e.getClass();
        this.d = new f(new nj5(((if3) f.a(c.a[0], context)).getData(), new e(3, null)), this);
        u63.Y(f13.a(v03Var), null, null, new a(null), 3);
    }

    @Override // defpackage.a9e
    public final String a() {
        cg5 cg5Var = this.c.get();
        if (cg5Var != null) {
            return cg5Var.a;
        }
        return null;
    }

    @Override // defpackage.a9e
    public final void b(String str) {
        str.getClass();
        u63.Y(f13.a(this.b), null, null, new g(str, null), 3);
    }
}
