package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mw5 implements do2 {
    private je1 _basisForProcessing;
    private String _documentDescription;
    private String _documentId;
    private String _documentVersion;
    private lw5 _gdpr;
    private Boolean _isEnabled;
    private mw5 sourceConfig;

    public final je1 a() {
        je1 je1Var = this._basisForProcessing;
        if (je1Var != null) {
            return je1Var;
        }
        mw5 mw5Var = this.sourceConfig;
        je1 je1VarA = mw5Var != null ? mw5Var.a() : null;
        return je1VarA == null ? je1.a : je1VarA;
    }

    public final String b() {
        String str = this._documentDescription;
        if (str != null) {
            return str;
        }
        mw5 mw5Var = this.sourceConfig;
        if (mw5Var != null) {
            return mw5Var.b();
        }
        return null;
    }

    public final String c() {
        String str = this._documentId;
        if (str != null) {
            return str;
        }
        mw5 mw5Var = this.sourceConfig;
        if (mw5Var != null) {
            return mw5Var.c();
        }
        return null;
    }

    public final String d() {
        String str = this._documentVersion;
        if (str != null) {
            return str;
        }
        mw5 mw5Var = this.sourceConfig;
        if (mw5Var != null) {
            return mw5Var.d();
        }
        return null;
    }

    public final mw5 e() {
        return this.sourceConfig;
    }

    public final void f(mw5 mw5Var) {
        this.sourceConfig = mw5Var;
    }
}
