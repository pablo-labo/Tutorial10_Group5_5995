package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj7d;", "Lbrg;", "sharedui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j7d extends brg {
    public final h7d b;
    public final boolean c;
    public final gse d;
    public final gse e;

    @uh3(c = "com.indeed.android.sharedui.responsiveness.ResponsivenessViewModel$getResponsiveStatus$1", f = "ResponsivenessViewModel.kt", l = {53, 71}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Date $dateNow;
        final /* synthetic */ Date $dateThreeMonthsAgo;
        final /* synthetic */ Date $dateTwoWeeksAgo;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Date date, Date date2, Date date3, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$dateTwoWeeksAgo = date;
            this.$dateNow = date2;
            this.$dateThreeMonthsAgo = date3;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return j7d.this.new a(this.$dateTwoWeeksAgo, this.$dateNow, this.$dateThreeMonthsAgo, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        
            if (r1 == r9) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r13v2 */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 280
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j7d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j7d(int i) {
        this.b = new h7d();
        boolean z = ((kr7) cr8.p(kr7.class)).e("droid_native_messaging_responsiveness").a > 0;
        this.c = z;
        gse gseVarE = hh2.e(new i7d(15, z));
        this.d = gseVarE;
        this.e = gseVarE;
    }

    public final void g() {
        ArrayList arrayList = lz2.a;
        StringBuilder sb = new StringBuilder("isResponsivenessEnabled: ");
        boolean z = this.c;
        sb.append(z);
        Log.d("ResponsivenessViewModel", sb.toString(), null);
        if (z) {
            Date date = new Date();
            Date date2 = new Date(date.getTime() - 1209600000);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(2, -3);
            Date time = calendar.getTime();
            time.getClass();
            u63.Y(ee3.p(this), null, null, new a(date2, date, time, null), 3);
        }
    }

    public final fse<i7d> h() {
        return this.e;
    }

    public j7d() {
        this(0);
    }
}
