package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e0g {
    public final String a;
    public final String b;
    public final String c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<fjg> f;
    public final hva<String> g;
    public final hva<p9c> h;
    public final hva<List<n9c>> i;

    public e0g() {
        throw null;
    }

    public e0g(int i) {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = "INLINE_SKILLS_SUGGESTIONS_DISMISSED";
        this.b = "close-btn";
        this.c = "POW";
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0g)) {
            return false;
        }
        e0g e0gVar = (e0g) obj;
        return wl7.b(this.a, e0gVar.a) && wl7.b(this.b, e0gVar.b) && wl7.b(this.c, e0gVar.c) && wl7.b(this.d, e0gVar.d) && wl7.b(this.e, e0gVar.e) && wl7.b(this.f, e0gVar.f) && wl7.b(this.g, e0gVar.g) && wl7.b(this.h, e0gVar.h) && wl7.b(this.i, e0gVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("UDPUserInteractionInput(userInteractionType=", this.a, ", userInteractionTarget=", this.b, ", contextKey=");
        sbF.append(this.c);
        sbF.append(", crowTaxoQuestionSuid=");
        sbF.append(this.d);
        sbF.append(", userInteractionTargetSuid=");
        w40.o(sbF, this.e, ", userInteractionSurface=", this.f, ", questionLabel=");
        w40.o(sbF, this.g, ", questionSource=", this.h, ", questionAttributeAnswers=");
        return akb.l(sbF, this.i, ")");
    }
}
