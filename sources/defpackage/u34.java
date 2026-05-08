package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import defpackage.v03;
import defpackage.v27;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class u34 implements xh8, e1g {
    public static final eu2 V;
    public static final u34 a = new u34();
    public static final LinkedHashSet b;
    public static final ArrayList c;
    public static final Lazy d;
    public static final Lazy e;
    public static final tx5 f;

    public static abstract class a {
        public abstract String a();
    }

    public static final class b extends a {
        public final String a;
        public final Intent b;

        public b(Intent intent, String str) {
            this.a = str;
            this.b = intent;
        }

        @Override // u34.a
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DefaultAction(text=" + this.a + ", intent=" + this.b + ")";
        }
    }

    public static final class c {
        public final Bitmap a;
        public final String b;

        public c(Bitmap bitmap, String str) {
            this.a = bitmap;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            Bitmap bitmap = this.a;
            return this.b.hashCode() + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
        }

        public final String toString() {
            return "LoadImageResult(bitmap=" + this.a + ", loadingStatus=" + this.b + ")";
        }
    }

    public static final class d extends a {
        public final String a;
        public final Intent b;

        public d(Intent intent, String str) {
            this.a = str;
            this.b = intent;
        }

        @Override // u34.a
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NotificationActionNext(text=" + this.a + ", intent=" + this.b + ")";
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.fcm.DeviceNotifications$sendNotification$1", f = "DeviceNotifications.kt", l = {151, 161}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $bannerImageUrl;
        final /* synthetic */ String $largeIconUrl;
        final /* synthetic */ Bundle $notificationData;
        final /* synthetic */ int $notificationId;
        final /* synthetic */ luc<x39> $receiveLoggedParams;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        @uh3(c = "com.indeed.android.jobsearch.fcm.DeviceNotifications$sendNotification$1$bigPictureLoading$1", f = "DeviceNotifications.kt", l = {146}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super c>, Object> {
            final /* synthetic */ String $bannerImageUrl;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$bannerImageUrl = str;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(this.$bannerImageUrl, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super c> lu2Var) {
                return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return obj;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                u34 u34Var = u34.a;
                String str = this.$bannerImageUrl;
                this.label = 1;
                u34Var.getClass();
                v27.a aVar = new v27.a(u34.b());
                aVar.c = str;
                v27 v27VarA = aVar.a();
                eq3 eq3Var = a74.a;
                Object objQ0 = u63.q0(no3.c, new v34(v27VarA, null), this);
                g13 g13Var = g13.a;
                return objQ0 == g13Var ? g13Var : objQ0;
            }
        }

        @uh3(c = "com.indeed.android.jobsearch.fcm.DeviceNotifications$sendNotification$1$largeIconLoading$1", f = "DeviceNotifications.kt", l = {147}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super c>, Object> {
            final /* synthetic */ String $largeIconUrl;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.$largeIconUrl = str;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.$largeIconUrl, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super c> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return obj;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                u34 u34Var = u34.a;
                String str = this.$largeIconUrl;
                this.label = 1;
                u34Var.getClass();
                v27.a aVar = new v27.a(u34.b());
                aVar.c = str;
                v27 v27VarA = aVar.a();
                eq3 eq3Var = a74.a;
                Object objQ0 = u63.q0(no3.c, new v34(v27VarA, null), this);
                g13 g13Var = g13.a;
                return objQ0 == g13Var ? g13Var : objQ0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, Bundle bundle, int i, luc<x39> lucVar, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$bannerImageUrl = str;
            this.$largeIconUrl = str2;
            this.$notificationData = bundle;
            this.$notificationId = i;
            this.$receiveLoggedParams = lucVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            e eVar = new e(this.$bannerImageUrl, this.$largeIconUrl, this.$notificationData, this.$notificationId, this.$receiveLoggedParams, lu2Var);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:111:0x04d5  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x017b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0518 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01e2 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0271 A[LOOP:1: B:77:0x026b->B:79:0x0271, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02bc A[LOOP:2: B:81:0x02b6->B:83:0x02bc, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0301  */
        /* JADX WARN: Type inference failed for: r10v11, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r11v0, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r1v56, types: [T, x39] */
        /* JADX WARN: Type inference failed for: r1v8, types: [T, x39] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1462
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: u34.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xh8 xh8Var) {
            super(0);
            this.$this_inject = xh8Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    public static final class g extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xh8 xh8Var) {
            super(0);
            this.$this_inject = xh8Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    static {
        Set setI0 = ut0.I0(new String[]{"title", "text", "ticker_text", "url", "collapse_key", "from", "banner_image_url", "large_icon_url"});
        oh7 oh7Var = new oh7(1, 3, 1);
        ArrayList arrayList = new ArrayList(t92.r0(oh7Var, 10));
        Iterator<Integer> it = oh7Var.iterator();
        while (((nh7) it).c) {
            arrayList.add(RumEventDeserializer.EVENT_TYPE_ACTION + ((fh7) it).nextInt() + "_url");
        }
        LinkedHashSet linkedHashSetO = bbe.o(setI0, arrayList);
        oh7 oh7Var2 = new oh7(1, 3, 1);
        ArrayList arrayList2 = new ArrayList(t92.r0(oh7Var2, 10));
        Iterator<Integer> it2 = oh7Var2.iterator();
        while (((nh7) it2).c) {
            arrayList2.add(RumEventDeserializer.EVENT_TYPE_ACTION + ((fh7) it2).nextInt() + "_text");
        }
        b = bbe.o(linkedHashSetO, arrayList2);
        oh7 oh7Var3 = new oh7(1, 3, 1);
        ArrayList arrayList3 = new ArrayList(t92.r0(oh7Var3, 10));
        Iterator<Integer> it3 = oh7Var3.iterator();
        while (((nh7) it3).c) {
            arrayList3.add("com.indeed.android.jobsearch.ACTION_BUTTON_" + ((fh7) it3).nextInt());
        }
        c = arrayList3;
        u34 u34Var = a;
        f fVar = new f(u34Var);
        qt8 qt8Var = qt8.a;
        d = boa.E(qt8Var, fVar);
        e = boa.E(qt8Var, new g(u34Var));
        f = new tx5();
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        V = f13.a(v03.a.C0438a.c(ezeVarA, no3.c));
    }

    public static Context b() {
        return (Context) d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, x39] */
    public static void c(Bundle bundle) {
        String string = bundle.getString("notification_id");
        if (string == null || string.length() == 0) {
            string = "1";
        }
        Integer numB = vve.B(10, string);
        if (numB == null) {
            ArrayList arrayList = lz2.a;
            lz2.h("DeviceNotifications", "Bad notification_id: " + ((Object) string), null, 12);
            return;
        }
        int iIntValue = numB.intValue();
        luc lucVar = new luc();
        lucVar.element = new x39(new ir(bundle, 4));
        u63.Y(V, null, null, new e(bundle.getString("banner_image_url"), bundle.getString("large_icon_url"), bundle, iIntValue, lucVar, null), 3);
    }

    @Override // defpackage.e1g
    public final void a(Context context) {
        for (bd4 bd4Var : bd4.values()) {
            bd4Var.e(context);
        }
        vla.a(context);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
