package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o4c extends iv1 implements qf8 {
    private final boolean syntheticJavaProperty;

    public o4c(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // defpackage.iv1
    public final ud8 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o4c) {
            o4c o4cVar = (o4c) obj;
            return getOwner().equals(o4cVar.getOwner()) && getName().equals(o4cVar.getName()) && getSignature().equals(o4cVar.getSignature()) && wl7.b(getBoundReceiver(), o4cVar.getBoundReceiver());
        }
        if (obj instanceof qf8) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.iv1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final qf8 getReflected() {
        if (!this.syntheticJavaProperty) {
            return (qf8) super.getReflected();
        }
        b0.u("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public final String toString() {
        ud8 ud8VarCompute = compute();
        if (ud8VarCompute != this) {
            return ud8VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
