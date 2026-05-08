package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class sx {
    public final e0g a;
    public final Instant b;

    public sx(e0g e0gVar, Instant instant) {
        this.a = e0gVar;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx)) {
            return false;
        }
        sx sxVar = (sx) obj;
        return this.a.equals(sxVar.a) && this.b.equals(sxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddUDPInteractionInput(userInteraction=" + this.a + ", timestamp=" + this.b + ")";
    }
}
