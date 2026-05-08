package defpackage;

import android.util.Log;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.hf3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c39 {
    public final i88 a;

    public static final class a {
        public final String a;
        public final long b;
        public final String c;

        public a(long j, String str, String str2) {
            this.a = str;
            this.b = j;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((((((Long.hashCode(this.b) + (((this.a.hashCode() * 31) + 1135978511) * 31)) * 31) + 93154881) * 31) + 96891546) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(tk=");
            sb.append(this.a);
            sb.append(", logType=trackEvent, timestamp=");
            sb.append(this.b);
            return m6.h(sb, ", application=atweb, moduleName=event, data=", this.c, ")");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.domain.usecase.LogEventUseCase$logAppCardViewedEvents$1", f = "LogEventUseCase.kt", l = {93, 114}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $isLoading;
        final /* synthetic */ List<SavedJobsDto> $jobs;
        final /* synthetic */ String $tabName;
        final /* synthetic */ String $tk;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ c39 this$0;

        @uh3(c = "com.indeed.android.myjobs.domain.usecase.LogEventUseCase$logAppCardViewedEvents$1$1$1", f = "LogEventUseCase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<hf3<j6g>, lu2<? super j6g>, Object> {
            /* synthetic */ Object L$0;
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(2, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<j6g> hf3Var, lu2<? super j6g> lu2Var) {
                return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                hf3 hf3Var = (hf3) this.L$0;
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                if (!(hf3Var instanceof hf3.c) && (hf3Var instanceof hf3.a)) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("MyJobsViewModel", "Error occurred while logging appCardViewed events", false, null, 8);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<SavedJobsDto> list, boolean z, c39 c39Var, String str, String str2, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$jobs = list;
            this.$isLoading = z;
            this.this$0 = c39Var;
            this.$tk = str;
            this.$tabName = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$jobs, this.$isLoading, this.this$0, this.$tk, this.$tabName, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0273  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0273 -> B:74:0x027a). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                Method dump skipped, instruction units count: 651
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c39.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.domain.usecase.LogEventUseCase$logTabMountedEvent$1", f = "LogEventUseCase.kt", l = {146, 161}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $tabName;
        final /* synthetic */ String $tk;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ c39 this$0;

        @uh3(c = "com.indeed.android.myjobs.domain.usecase.LogEventUseCase$logTabMountedEvent$1$1", f = "LogEventUseCase.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<hf3<j6g>, lu2<? super j6g>, Object> {
            /* synthetic */ Object L$0;
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(2, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<j6g> hf3Var, lu2<? super j6g> lu2Var) {
                return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                hf3 hf3Var = (hf3) this.L$0;
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                if (!(hf3Var instanceof hf3.c) && (hf3Var instanceof hf3.a)) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("TabMountedEvent", "Error occurred while logging data", false, null, 8);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, c39 c39Var, String str2, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$tabName = str;
            this.this$0 = c39Var;
            this.$tk = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$tabName, this.this$0, this.$tk, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r14, r0, r13) == r4) goto L21;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                int r0 = r13.label
                r1 = 1
                r2 = 2
                r3 = 0
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L34
                if (r0 == r1) goto L24
                if (r0 != r2) goto L1e
                java.lang.Object r0 = r13.L$2
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r13.L$1
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r13 = r13.L$0
                java.lang.String r13 = (java.lang.String) r13
                defpackage.r7d.b(r14)
                goto Lba
            L1e:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r13)
                return r3
            L24:
                java.lang.Object r0 = r13.L$2
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r13.L$1
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r13.L$0
                java.lang.String r0 = (java.lang.String) r0
                defpackage.r7d.b(r14)
                goto La4
            L34:
                defpackage.r7d.b(r14)
                java.lang.String r14 = r13.$tabName
                java.util.Locale r0 = java.util.Locale.getDefault()
                r0.getClass()
                java.lang.String r14 = r14.toUpperCase(r0)
                r14.getClass()
                java.lang.String r0 = r13.$tabName
                java.util.Locale r5 = java.util.Locale.getDefault()
                r5.getClass()
                java.lang.String r0 = r0.toLowerCase(r5)
                r0.getClass()
                java.lang.String r5 = "/"
                java.lang.String r5 = r5.concat(r0)
                c39 r6 = r13.this$0
                c39$a r7 = new c39$a
                java.lang.String r8 = r13.$tk
                if (r8 != 0) goto L73
                rqc r8 = defpackage.v0b.b
                fse<T> r8 = r8.a
                java.lang.Object r8 = r8.getValue()
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L73
                java.lang.String r8 = defpackage.ie7.Z
            L73:
                long r9 = java.lang.System.currentTimeMillis()
                ae6 r11 = new ae6
                r11.<init>()
                j6f r12 = new j6f
                r12.<init>(r14, r5, r0)
                java.lang.String r14 = r11.f(r12)
                r14.getClass()
                r7.<init>(r9, r8, r14)
                r13.L$0 = r3
                r13.L$1 = r3
                r13.L$2 = r3
                r13.label = r1
                r6.getClass()
                d39 r14 = new d39
                r14.<init>(r7, r6, r3)
                kjd r0 = new kjd
                r0.<init>(r14)
                if (r0 != r4) goto La3
                goto Lb9
            La3:
                r14 = r0
            La4:
                vi5 r14 = (defpackage.vi5) r14
                c39$c$a r0 = new c39$c$a
                r0.<init>(r2, r3)
                r13.L$0 = r3
                r13.L$1 = r3
                r13.L$2 = r3
                r13.label = r2
                java.lang.Object r13 = defpackage.wg2.q(r14, r0, r13)
                if (r13 != r4) goto Lba
            Lb9:
                return r4
            Lba:
                j6g r13 = defpackage.j6g.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: c39.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c39(i88 i88Var) {
        this.a = i88Var;
    }

    public final void a(String str, e13 e13Var, List<SavedJobsDto> list, boolean z) {
        String str2;
        e13Var.getClass();
        if (i6a.c().a == 4) {
            String str3 = (String) v0b.b.a.getValue();
            if (str3 == null) {
                str3 = ie7.Z;
            }
            str2 = str3;
        } else {
            str2 = null;
        }
        u63.Y(e13Var, null, null, new b(list, z, this, str2, str, null), 3);
    }

    public final void b(String str, e13 e13Var) {
        String str2;
        e13Var.getClass();
        Log.d("MyJobsScreen", "Logging tab mounted event for " + str + " tab");
        int i = i6a.c().a;
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            if (i6a.c().a == 4) {
                str2 = (String) v0b.b.a.getValue();
                if (str2 == null) {
                    str2 = ie7.Z;
                }
            } else {
                str2 = null;
            }
            u63.Y(e13Var, null, null, new c(str, this, str2, null), 3);
        }
    }
}
