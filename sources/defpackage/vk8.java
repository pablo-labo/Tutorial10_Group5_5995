package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.indeed.android.jobsearch.LaunchActivity;
import defpackage.kv8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.LaunchActivity$observeActivityLevelPushAuthEvents$1", f = "LaunchActivity.kt", l = {435}, m = "invokeSuspend")
public final class vk8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ LaunchActivity this$0;

    @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$observeActivityLevelPushAuthEvents$1$1", f = "LaunchActivity.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LaunchActivity this$0;

        /* JADX INFO: renamed from: vk8$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$observeActivityLevelPushAuthEvents$1$1$1", f = "LaunchActivity.kt", l = {437}, m = "invokeSuspend")
        public static final class C0454a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ LaunchActivity this$0;

            /* JADX INFO: renamed from: vk8$a$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$observeActivityLevelPushAuthEvents$1$1$1$1", f = "LaunchActivity.kt", l = {}, m = "invokeSuspend")
            public static final class C0455a extends c1f implements Function2<q4d, lu2<? super j6g>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ LaunchActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0455a(LaunchActivity launchActivity, lu2<? super C0455a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = launchActivity;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0455a c0455a = new C0455a(this.this$0, lu2Var);
                    c0455a.L$0 = obj;
                    return c0455a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(q4d q4dVar, lu2<? super j6g> lu2Var) {
                    return ((C0455a) create(q4dVar, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    q4d q4dVar = (q4d) this.L$0;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    ArrayList arrayList = lz2.a;
                    Log.d("LaunchActivity", "requestSystemPushAuthEvent", null);
                    ft7 ft7VarA = ((at7) cr8.p(at7.class)).a();
                    LaunchActivity launchActivity = this.this$0;
                    if (ft7VarA != ft7.b) {
                        launchActivity.V0 = q4dVar.a;
                        launchActivity.X0.a("android.permission.POST_NOTIFICATIONS");
                    } else {
                        launchActivity.W0 = q4dVar.a;
                        e9 e9Var = launchActivity.Y0;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", launchActivity.getPackageName(), null));
                        e9Var.a(intent);
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0454a(LaunchActivity launchActivity, lu2<? super C0454a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = launchActivity;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0454a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0454a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    nde ndeVarH = ((y7c) this.this$0.F0.getValue()).h();
                    C0455a c0455a = new C0455a(this.this$0, null);
                    this.label = 1;
                    Object objQ = wg2.q(ndeVarH, c0455a, this);
                    g13 g13Var = g13.a;
                    if (objQ == g13Var) {
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

        @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$observeActivityLevelPushAuthEvents$1$1$2", f = "LaunchActivity.kt", l = {449}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ LaunchActivity this$0;

            /* JADX INFO: renamed from: vk8$a$b$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$observeActivityLevelPushAuthEvents$1$1$2$1", f = "LaunchActivity.kt", l = {}, m = "invokeSuspend")
            public static final class C0456a extends c1f implements Function2<m4d, lu2<? super j6g>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ LaunchActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0456a(LaunchActivity launchActivity, lu2<? super C0456a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = launchActivity;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0456a c0456a = new C0456a(this.this$0, lu2Var);
                    c0456a.L$0 = obj;
                    return c0456a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(m4d m4dVar, lu2<? super j6g> lu2Var) {
                    return ((C0456a) create(m4dVar, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    m4d m4dVar = (m4d) this.L$0;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    ArrayList arrayList = lz2.a;
                    Log.d("LaunchActivity", "navigateToAppSettingsEvent", null);
                    LaunchActivity launchActivity = this.this$0;
                    launchActivity.W0 = m4dVar.a;
                    e9 e9Var = launchActivity.Y0;
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", launchActivity.getPackageName(), null));
                    e9Var.a(intent);
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LaunchActivity launchActivity, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.this$0 = launchActivity;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    nde ndeVarF = ((y7c) this.this$0.F0.getValue()).f();
                    C0456a c0456a = new C0456a(this.this$0, null);
                    this.label = 1;
                    Object objQ = wg2.q(ndeVarF, c0456a, this);
                    g13 g13Var = g13.a;
                    if (objQ == g13Var) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LaunchActivity launchActivity, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = launchActivity;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            e13 e13Var = (e13) this.L$0;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            u63.Y(e13Var, null, null, new C0454a(this.this$0, null), 3);
            u63.Y(e13Var, null, null, new b(this.this$0, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk8(LaunchActivity launchActivity, lu2<? super vk8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = launchActivity;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new vk8(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((vk8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            LaunchActivity launchActivity = this.this$0;
            a aVar = new a(launchActivity, null);
            this.label = 1;
            Object objB = c2d.b(launchActivity, kv8.b.c, aVar, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
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
