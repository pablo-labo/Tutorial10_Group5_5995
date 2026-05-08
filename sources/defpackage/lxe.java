package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lxe extends nde<Integer> implements fse<Integer> {
    @Override // defpackage.fse
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.W;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.X + ((long) ((int) ((s() + ((long) this.Z)) - this.X)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void z(int i) {
        synchronized (this) {
            Object[] objArr = this.W;
            objArr.getClass();
            b(Integer.valueOf(((Number) objArr[((int) ((this.X + ((long) ((int) ((s() + ((long) this.Z)) - this.X)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
