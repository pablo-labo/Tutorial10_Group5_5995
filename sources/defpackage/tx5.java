package defpackage;

import defpackage.lx5;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class tx5 {
    public final List<String> a;

    public static final class a extends mj8 implements Function1<lx5.b, j6g> {
        final /* synthetic */ String $elementName;
        final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
        final /* synthetic */ String $screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, Function1<? super lx5.b, j6g> function1) {
            super(1);
            this.$screenName = str;
            this.$elementName = str2;
            this.$extraParams = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(lx5.b bVar) {
            lx5.b bVar2 = bVar;
            bVar2.getClass();
            bVar2.a("screenName", this.$screenName);
            bVar2.a("elementName", this.$elementName);
            this.$extraParams.invoke(bVar2);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<lx5.b, j6g> {
        final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
        final /* synthetic */ String $loggableUrl;
        final /* synthetic */ String $result;
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, Function1 function1) {
            super(1);
            this.$extraParams = function1;
            this.$result = str;
            this.$loggableUrl = str2;
            this.$source = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(lx5.b bVar) {
            lx5.b bVar2 = bVar;
            bVar2.getClass();
            this.$extraParams.invoke(bVar2);
            bVar2.a("result", this.$result);
            bVar2.a("loggableUrl", this.$loggableUrl);
            bVar2.a("source", this.$source);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<lx5.b, j6g> {
        final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
        final /* synthetic */ String $screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Function1 function1) {
            super(1);
            this.$extraParams = function1;
            this.$screenName = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(lx5.b bVar) {
            lx5.b bVar2 = bVar;
            bVar2.getClass();
            this.$extraParams.invoke(bVar2);
            bVar2.a("screenName", this.$screenName);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function1<lx5.b, j6g> {
        final /* synthetic */ String $elementName;
        final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
        final /* synthetic */ String $screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, Function1 function1) {
            super(1);
            this.$extraParams = function1;
            this.$screenName = str;
            this.$elementName = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(lx5.b bVar) {
            lx5.b bVar2 = bVar;
            bVar2.getClass();
            this.$extraParams.invoke(bVar2);
            bVar2.a("screenName", this.$screenName);
            bVar2.a("elementName", this.$elementName);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function1<lx5.b, j6g> {
        final /* synthetic */ String $elementName;
        final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
        final /* synthetic */ String $screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, Function1 function1) {
            super(1);
            this.$extraParams = function1;
            this.$screenName = str;
            this.$elementName = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(lx5.b bVar) {
            lx5.b bVar2 = bVar;
            bVar2.getClass();
            this.$extraParams.invoke(bVar2);
            bVar2.a("screenName", this.$screenName);
            bVar2.a("elementName", this.$elementName);
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements Function1<lx5.b, j6g> {
        final /* synthetic */ String $elementName;
        final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
        final /* synthetic */ String $screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, Function1 function1) {
            super(1);
            this.$extraParams = function1;
            this.$screenName = str;
            this.$elementName = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(lx5.b bVar) {
            lx5.b bVar2 = bVar;
            bVar2.getClass();
            this.$extraParams.invoke(bVar2);
            bVar2.a("screenName", this.$screenName);
            bVar2.a("elementName", this.$elementName);
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function1<lx5.b, j6g> {
        final /* synthetic */ String $postApplyConfirmMessage;
        final /* synthetic */ String $postApplyConfirmUrl;
        final /* synthetic */ String $postApplyUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, String str3) {
            super(1);
            this.$postApplyUrl = str;
            this.$postApplyConfirmMessage = str2;
            this.$postApplyConfirmUrl = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(lx5.b bVar) {
            lx5.b bVar2 = bVar;
            bVar2.getClass();
            bVar2.a("postApplyUrl", this.$postApplyUrl);
            String str = this.$postApplyUrl;
            bVar2.c("hasPostApplyUrl", Boolean.valueOf(!(str == null || str.length() == 0)));
            bVar2.a("postApplyConfirmMessage", this.$postApplyConfirmMessage);
            String str2 = this.$postApplyConfirmMessage;
            bVar2.c("hasPostApplyConfirmMessage", Boolean.valueOf(!(str2 == null || str2.length() == 0)));
            bVar2.a("postApplyConfirmUrl", this.$postApplyConfirmUrl);
            String str3 = this.$postApplyConfirmUrl;
            bVar2.c("hasPostApplyConfirmUrl", Boolean.valueOf(!(str3 == null || str3.length() == 0)));
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements Function1<lx5.b, j6g> {
        final /* synthetic */ String $authorized;
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $importance;
        final /* synthetic */ String $notificationSettings;
        final /* synthetic */ String $previouslyAuthorized;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, String str3, String str4, String str5) {
            super(1);
            this.$authorized = str;
            this.$channelId = str2;
            this.$importance = str3;
            this.$notificationSettings = str4;
            this.$previouslyAuthorized = str5;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(lx5.b bVar) {
            lx5.b bVar2 = bVar;
            bVar2.getClass();
            bVar2.a("authorized", this.$authorized);
            bVar2.a("channelId", this.$channelId);
            bVar2.a("importance", this.$importance);
            bVar2.a("notificationSettings", this.$notificationSettings);
            bVar2.a("previouslyAuthorized", this.$previouslyAuthorized);
            return j6g.a;
        }
    }

    public static final class i extends mj8 implements Function1<lx5.b, j6g> {
        final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
        final /* synthetic */ String $screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, Function1 function1) {
            super(1);
            this.$extraParams = function1;
            this.$screenName = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(lx5.b bVar) {
            lx5.b bVar2 = bVar;
            bVar2.getClass();
            this.$extraParams.invoke(bVar2);
            bVar2.a("screenName", this.$screenName);
            return j6g.a;
        }
    }

    public tx5(String... strArr) {
        this.a = ut0.E0(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ lx5 d(tx5 tx5Var, String str, String str2, Function1 function1, int i2) {
        if ((i2 & 8) != 0) {
            function1 = s42.c;
        }
        return tx5Var.c(str, str2, null, function1);
    }

    public static lx5 e(tx5 tx5Var, String str, String str2, Function1 function1, int i2) {
        if ((i2 & 8) != 0) {
            function1 = ca0.c;
        }
        tx5Var.getClass();
        str.getClass();
        function1.getClass();
        return new lx5("impression_element_view", "impression", "elementView", 1, z92.h1(tx5Var.a, zr4.a), new xx5(str, str2, function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ lx5 g(tx5 tx5Var, String str, Function1 function1, int i2) {
        if ((i2 & 4) != 0) {
            function1 = zx5.b;
        }
        return tx5Var.f(str, zr4.a, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ lx5 i(tx5 tx5Var, String str, String str2, Function1 function1, int i2) {
        if ((i2 & 8) != 0) {
            function1 = nh3.c;
        }
        return tx5Var.h(str, str2, zr4.a, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ lx5 k(tx5 tx5Var, String str, String str2, Function1 function1, int i2) {
        if ((i2 & 8) != 0) {
            function1 = l93.c;
        }
        return tx5Var.j(str, str2, zr4.a, function1);
    }

    public static lx5 n(List list, qs0 qs0Var) {
        return new lx5("navigate_to_interview_prep", "navigation", "navigate_to_interview_prep", 1, list, new gy5(qs0Var));
    }

    public static lx5 r(tx5 tx5Var, String str) {
        bi3 bi3Var = bi3.c;
        bi3Var.getClass();
        return new lx5("show_flow", "other", "showFlow", 1, tx5Var.a, new sy5(false, str, bi3Var));
    }

    public static lx5 s(tx5 tx5Var, String str) {
        r50 r50Var = r50.c;
        r50Var.getClass();
        return new lx5("show_flow", "other", "showFlow", 1, tx5Var.a, new ty5(str, r50Var));
    }

    public final lx5 a(boolean z) {
        return new lx5("auth_result", "other", "authResult", 1, this.a, new rx5(z));
    }

    public final lx5 b(String str, String str2, List<String> list, Function1<? super lx5.b, j6g> function1) {
        str.getClass();
        str2.getClass();
        list.getClass();
        function1.getClass();
        return new lx5("begin_typing", "interaction", "beginTyping", 1, z92.h1(this.a, list), new a(str, str2, function1));
    }

    public final lx5 c(String str, String str2, String str3, Function1<? super lx5.b, j6g> function1) {
        function1.getClass();
        return new lx5("external_app_open", "other", "externalAppOpen", 1, this.a, new b(str, str2, str3, function1));
    }

    public final lx5 f(String str, List<String> list, Function1<? super lx5.b, j6g> function1) {
        str.getClass();
        list.getClass();
        function1.getClass();
        return new lx5("impression_screen_view", "impression", "screenView", 1, z92.h1(this.a, list), new c(str, function1));
    }

    public final lx5 h(String str, String str2, List<String> list, Function1<? super lx5.b, j6g> function1) {
        str.getClass();
        str2.getClass();
        list.getClass();
        function1.getClass();
        return new lx5("interaction_dismiss", "interaction", "dismiss", 1, z92.h1(this.a, list), new d(str, str2, function1));
    }

    public final lx5 j(String str, String str2, List<String> list, Function1<? super lx5.b, j6g> function1) {
        str.getClass();
        str2.getClass();
        list.getClass();
        function1.getClass();
        return new lx5("interaction_tap_button", "interaction", "tapButton", 1, z92.h1(this.a, list), new e(str, str2, function1));
    }

    public final lx5 l(String str, String str2, List<String> list, Function1<? super lx5.b, j6g> function1) {
        str.getClass();
        str2.getClass();
        list.getClass();
        function1.getClass();
        return new lx5("interaction_tap_option", "interaction", "tapOption", 1, z92.h1(this.a, list), new f(str, str2, function1));
    }

    public final lx5 m(String str, String str2, String str3) {
        return new lx5("jsma_bridge_apply_did_complete", "other", "jsmaBridgeIndeedApplyDidComplete", 1, this.a, new g(str, str2, str3));
    }

    public final lx5 o(String str, String str2) {
        str2.getClass();
        return new lx5("navigation_back", "navigation", "navigationBack", 1, this.a, new hy5(str, str2));
    }

    public final lx5 p(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str5.getClass();
        return new lx5("droid_notif_update_delivery_preference", "PUSH_NOTIFICATION", "UPDATE_DELIVERY_PREFERENCE", 1, this.a, new h(str, str2, str3, str4, str5));
    }

    public final lx5 q(String str, Function1<? super lx5.b, j6g> function1) {
        str.getClass();
        return new lx5("resume_upload_decision", "other", "resumeUploadDecision", 1, this.a, new i(str, function1));
    }

    public /* synthetic */ tx5() {
        this(new String[0]);
    }
}
