package defpackage;

import defpackage.sp7;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ei implements gu5 {
    public final /* synthetic */ luc V;
    public final /* synthetic */ luc W;
    public final /* synthetic */ g4a X;
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ luc b;
    public final /* synthetic */ luc c;
    public final /* synthetic */ luc d;
    public final /* synthetic */ luc e;
    public final /* synthetic */ luc f;

    public /* synthetic */ ei(Function1 function1, luc lucVar, luc lucVar2, luc lucVar3, luc lucVar4, luc lucVar5, luc lucVar6, luc lucVar7, g4a g4aVar) {
        this.a = function1;
        this.b = lucVar;
        this.c = lucVar2;
        this.d = lucVar3;
        this.e = lucVar4;
        this.f = lucVar5;
        this.V = lucVar6;
        this.W = lucVar7;
        this.X = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-education", "save", null, null, 12));
        String str = (String) this.b.element;
        String str2 = (String) this.c.element;
        String str3 = (String) this.d.element;
        String str4 = (String) this.e.element;
        String str5 = (String) this.f.element;
        Locale locale = (Locale) this.V.element;
        this.a.invoke(new go4(str, str2, str3, str4, str5, locale != null ? locale.getCountry() : null, (String) this.W.element, (ig3) this.X.getValue(), 3));
        return j6g.a;
    }
}
