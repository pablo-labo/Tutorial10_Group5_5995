package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sye {
    public final pye a;
    public final qye b;

    public sye(pye pyeVar, qye qyeVar) {
        this.a = pyeVar;
        this.b = qyeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sye)) {
            return false;
        }
        sye syeVar = (sye) obj;
        return this.a.equals(syeVar.a) && this.b.equals(syeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestedMessageInput(conversationContextualDataInput=" + this.a + ", generationOptionInput=" + this.b + ")";
    }
}
