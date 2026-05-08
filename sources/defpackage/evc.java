package defpackage;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class evc extends qv5 implements Function1<Member, Boolean> {
    public static final evc a = new evc(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Member member) {
        Member member2 = member;
        member2.getClass();
        return Boolean.valueOf(member2.isSynthetic());
    }
}
