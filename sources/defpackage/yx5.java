package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yx5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ String $elementName = "postApplyShowBanner";
    final /* synthetic */ String $postApplyConfirmMessage;
    final /* synthetic */ String $postApplyConfirmUrl;
    final /* synthetic */ String $screenName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx5(String str, String str2, String str3) {
        super(1);
        this.$screenName = str;
        this.$postApplyConfirmMessage = str2;
        this.$postApplyConfirmUrl = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        bVar2.a("screenName", this.$screenName);
        bVar2.a("elementName", this.$elementName);
        bVar2.a("postApplyConfirmMessage", this.$postApplyConfirmMessage);
        bVar2.c("hasPostApplyConfirmMessage", Boolean.valueOf(!(this.$postApplyConfirmMessage.length() == 0)));
        bVar2.a("postApplyConfirmUrl", this.$postApplyConfirmUrl);
        String str = this.$postApplyConfirmUrl;
        bVar2.c("hasPostApplyConfirmUrl", Boolean.valueOf(!(str == null || str.length() == 0)));
        return j6g.a;
    }
}
