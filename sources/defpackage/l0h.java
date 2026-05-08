package defpackage;

import android.view.View;
import defpackage.kv8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l0h implements uv8 {
    public final /* synthetic */ eu2 a;
    public final /* synthetic */ r6b b;
    public final /* synthetic */ xsc c;
    public final /* synthetic */ luc<mz9> d;
    public final /* synthetic */ View e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kv8.a.values().length];
            try {
                iArr[kv8.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kv8.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kv8.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kv8.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kv8.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kv8.a.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kv8.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    @uh3(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {388}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ xsc $recomposer;
        final /* synthetic */ l0h $self;
        final /* synthetic */ zv8 $source;
        final /* synthetic */ luc<mz9> $systemDurationScaleSettingConsumer;
        final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
        private /* synthetic */ Object L$0;
        int label;

        @uh3(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {383}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ fse<Float> $durationScaleStateFlow;
            final /* synthetic */ mz9 $it;
            int label;

            /* JADX INFO: renamed from: l0h$b$a$a, reason: collision with other inner class name */
            public static final class C0305a<T> implements wi5 {
                public final /* synthetic */ mz9 a;

                public C0305a(mz9 mz9Var) {
                    this.a = mz9Var;
                }

                @Override // defpackage.wi5
                public final Object a(Object obj, lu2 lu2Var) {
                    ((cme) this.a.a).q(((Number) obj).floatValue());
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fse<Float> fseVar, mz9 mz9Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$durationScaleStateFlow = fseVar;
                this.$it = mz9Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(this.$durationScaleStateFlow, this.$it, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                return g13.a;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    fse<Float> fseVar = this.$durationScaleStateFlow;
                    C0305a c0305a = new C0305a(this.$it);
                    this.label = 1;
                    Object objE = fseVar.e(c0305a, this);
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
                r40.e();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(luc<mz9> lucVar, xsc xscVar, zv8 zv8Var, l0h l0hVar, View view, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$systemDurationScaleSettingConsumer = lucVar;
            this.$recomposer = xscVar;
            this.$source = zv8Var;
            this.$self = l0hVar;
            this.$this_createLifecycleAwareWindowRecomposer = view;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [int] */
        /* JADX WARN: Type inference failed for: r0v1, types: [ex7] */
        /* JADX WARN: Type inference failed for: r0v4 */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            ex7 ex7VarY;
            ?? r0 = this.label;
            try {
                if (r0 == 0) {
                    r7d.b(obj);
                    e13 e13Var = (e13) this.L$0;
                    try {
                        mz9 mz9Var = this.$systemDurationScaleSettingConsumer.element;
                        if (mz9Var != null) {
                            fse fseVarA = o0h.a(this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext());
                            ((cme) mz9Var.a).q(((Number) fseVarA.getValue()).floatValue());
                            ex7VarY = u63.Y(e13Var, null, null, new a(fseVarA, mz9Var, null), 3);
                        } else {
                            ex7VarY = null;
                        }
                        xsc xscVar = this.$recomposer;
                        this.L$0 = ex7VarY;
                        this.label = 1;
                        xscVar.getClass();
                        Object objQ0 = u63.q0(xscVar.a, new zsc(xscVar, new btc(xscVar, null), ly9.a(getContext()), null), this);
                        Object obj2 = g13.a;
                        if (objQ0 != obj2) {
                            objQ0 = j6g.a;
                        }
                        if (objQ0 != obj2) {
                            objQ0 = j6g.a;
                        }
                        if (objQ0 == obj2) {
                            return obj2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r0 = 0;
                        if (r0 != 0) {
                            r0.h(null);
                        }
                        this.$source.getLifecycle().c(this.$self);
                        throw th;
                    }
                } else {
                    if (r0 != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ex7VarY = (ex7) this.L$0;
                    r7d.b(obj);
                }
                if (ex7VarY != null) {
                    ex7VarY.h(null);
                }
                this.$source.getLifecycle().c(this.$self);
                return j6g.a;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public l0h(eu2 eu2Var, r6b r6bVar, xsc xscVar, luc lucVar, View view) {
        this.a = eu2Var;
        this.b = r6bVar;
        this.c = xscVar;
        this.d = lucVar;
        this.e = view;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        boolean z;
        pw1<j6g> pw1VarZ = null;
        switch (a.a[aVar.ordinal()]) {
            case 1:
                u63.Y(this.a, null, i13.d, new b(this.d, this.c, zv8Var, this, this.e, null), 1);
                return;
            case 2:
                r6b r6bVar = this.b;
                if (r6bVar != null) {
                    pk8 pk8Var = r6bVar.b;
                    synchronized (pk8Var.a) {
                        try {
                            synchronized (pk8Var.a) {
                                z = pk8Var.d;
                            }
                            if (!z) {
                                ArrayList arrayList = pk8Var.b;
                                pk8Var.b = pk8Var.c;
                                pk8Var.c = arrayList;
                                pk8Var.d = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((lu2) arrayList.get(i)).resumeWith(j6g.a);
                                }
                                arrayList.clear();
                                j6g j6gVar = j6g.a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                xsc xscVar = this.c;
                synchronized (xscVar.b) {
                    if (xscVar.s) {
                        xscVar.s = false;
                        pw1VarZ = xscVar.z();
                    }
                    break;
                }
                if (pw1VarZ != null) {
                    ((qw1) pw1VarZ).resumeWith(j6g.a);
                    return;
                }
                return;
            case 3:
                xsc xscVar2 = this.c;
                synchronized (xscVar2.b) {
                    xscVar2.s = true;
                    j6g j6gVar2 = j6g.a;
                }
                return;
            case 4:
                this.c.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                l.g();
                return;
        }
    }
}
