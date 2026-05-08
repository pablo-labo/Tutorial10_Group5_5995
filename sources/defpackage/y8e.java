package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class y8e implements do2 {
    private ulf _backgroundTimeout;
    private Boolean _continueSessionOnRestart;
    private ulf _foregroundTimeout;
    private Boolean _isPaused;
    private yq2<y9e> _onSessionUpdate;
    private y8e sourceConfig;

    public y8e(ulf ulfVar, ulf ulfVar2) {
        if (ulfVar != null) {
            this._foregroundTimeout = ulfVar;
        }
        if (ulfVar2 != null) {
            this._backgroundTimeout = ulfVar2;
        }
    }

    public final void a() {
        this._continueSessionOnRestart = Boolean.TRUE;
    }

    public final ulf b() {
        ulf ulfVar = this._backgroundTimeout;
        if (ulfVar != null) {
            return ulfVar;
        }
        y8e y8eVar = this.sourceConfig;
        ulf ulfVarB = y8eVar != null ? y8eVar.b() : null;
        return ulfVarB == null ? new ulf(1800L, TimeUnit.SECONDS) : ulfVarB;
    }

    public final boolean c() {
        Boolean bool = this._continueSessionOnRestart;
        if (bool != null) {
            return bool.booleanValue();
        }
        y8e y8eVar = this.sourceConfig;
        Boolean boolValueOf = y8eVar != null ? Boolean.valueOf(y8eVar.c()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final ulf d() {
        ulf ulfVar = this._foregroundTimeout;
        if (ulfVar != null) {
            return ulfVar;
        }
        y8e y8eVar = this.sourceConfig;
        ulf ulfVarD = y8eVar != null ? y8eVar.d() : null;
        return ulfVarD == null ? new ulf(1800L, TimeUnit.SECONDS) : ulfVarD;
    }

    public final yq2<y9e> e() {
        yq2<y9e> yq2Var = this._onSessionUpdate;
        if (yq2Var != null) {
            return yq2Var;
        }
        y8e y8eVar = this.sourceConfig;
        if (y8eVar != null) {
            return y8eVar.e();
        }
        return null;
    }

    public final boolean f() {
        Boolean bool = this._isPaused;
        if (bool != null) {
            return bool.booleanValue();
        }
        y8e y8eVar = this.sourceConfig;
        Boolean boolValueOf = y8eVar != null ? Boolean.valueOf(y8eVar.f()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void g(y8e y8eVar) {
        this.sourceConfig = y8eVar;
    }
}
