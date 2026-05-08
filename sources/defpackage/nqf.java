package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nqf implements do2 {
    public static final /* synthetic */ int a = 0;
    private String _appId = "com.indeed.android.jobsearch";
    private Boolean _applicationContext;
    private Boolean _base64encoding;
    private Boolean _deepLinkContext;
    private y34 _devicePlatform;
    private Boolean _diagnosticAutotracking;
    private Boolean _exceptionAutotracking;
    private Boolean _geoLocationContext;
    private Boolean _installAutotracking;
    private Boolean _isPaused;
    private Boolean _lifecycleAutotracking;
    private j39 _logLevel;
    private f49 _loggerDelegate;
    private Boolean _platformContext;
    private List<? extends fbb> _platformContextProperties;
    private gbb _platformContextRetriever;
    private Boolean _screenContext;
    private Boolean _screenEngagementAutotracking;
    private Boolean _screenViewAutotracking;
    private Boolean _sessionContext;
    private String _trackerVersionSuffix;
    private Boolean _userAnonymisation;
    private nqf sourceConfig;

    public nqf(int i) {
    }

    public final void A() {
        this._installAutotracking = Boolean.TRUE;
    }

    public final boolean B() {
        Boolean bool = this._isPaused;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.B()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void C() {
        this._lifecycleAutotracking = Boolean.TRUE;
    }

    public final void D() {
        this._logLevel = j39.OFF;
    }

    public final void E() {
        this._platformContext = Boolean.TRUE;
    }

    public final void F() {
        this._screenContext = Boolean.TRUE;
    }

    public final void G() {
        this._screenEngagementAutotracking = Boolean.TRUE;
    }

    public final void H() {
        this._screenViewAutotracking = Boolean.TRUE;
    }

    public final void I() {
        this._sessionContext = Boolean.TRUE;
    }

    public final void J(nqf nqfVar) {
        this.sourceConfig = nqfVar;
    }

    public final void K() {
        this._userAnonymisation = Boolean.TRUE;
    }

    public final void a() {
        this._base64encoding = Boolean.FALSE;
    }

    public final void b() {
        this._deepLinkContext = Boolean.TRUE;
    }

    public final void c() {
        this._diagnosticAutotracking = Boolean.FALSE;
    }

    public final void d() {
        this._exceptionAutotracking = Boolean.FALSE;
    }

    public final void e() {
        this._geoLocationContext = Boolean.FALSE;
    }

    public final String f() {
        String str = this._appId;
        if (str != null) {
            return str;
        }
        nqf nqfVar = this.sourceConfig;
        String strF = nqfVar != null ? nqfVar.f() : null;
        return strF == null ? "" : strF;
    }

    public final boolean g() {
        Boolean bool = this._applicationContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.g()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final boolean h() {
        Boolean bool = this._base64encoding;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.h()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final boolean i() {
        Boolean bool = this._deepLinkContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.i()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final y34 j() {
        y34 y34Var = this._devicePlatform;
        if (y34Var != null) {
            return y34Var;
        }
        nqf nqfVar = this.sourceConfig;
        y34 y34VarJ = nqfVar != null ? nqfVar.j() : null;
        return y34VarJ == null ? y34.Mobile : y34VarJ;
    }

    public final boolean k() {
        Boolean bool = this._diagnosticAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.k()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean l() {
        Boolean bool = this._exceptionAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.l()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final boolean m() {
        Boolean bool = this._geoLocationContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.m()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean n() {
        Boolean bool = this._installAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.n()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final boolean o() {
        Boolean bool = this._lifecycleAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.o()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final j39 p() {
        j39 j39Var = this._logLevel;
        if (j39Var != null) {
            return j39Var;
        }
        nqf nqfVar = this.sourceConfig;
        j39 j39VarP = nqfVar != null ? nqfVar.p() : null;
        return j39VarP == null ? j39.OFF : j39VarP;
    }

    public final f49 q() {
        f49 f49Var = this._loggerDelegate;
        if (f49Var != null) {
            return f49Var;
        }
        nqf nqfVar = this.sourceConfig;
        if (nqfVar != null) {
            return nqfVar.q();
        }
        return null;
    }

    public final boolean r() {
        Boolean bool = this._platformContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.r()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final List<fbb> s() {
        List list = this._platformContextProperties;
        if (list != null) {
            return list;
        }
        nqf nqfVar = this.sourceConfig;
        if (nqfVar != null) {
            return nqfVar.s();
        }
        return null;
    }

    public final gbb t() {
        gbb gbbVar = this._platformContextRetriever;
        if (gbbVar != null) {
            return gbbVar;
        }
        nqf nqfVar = this.sourceConfig;
        if (nqfVar != null) {
            return nqfVar.t();
        }
        return null;
    }

    public final boolean u() {
        Boolean bool = this._screenContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.u()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final boolean v() {
        Boolean bool = this._screenEngagementAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.v()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final boolean w() {
        Boolean bool = this._screenViewAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.w()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final boolean x() {
        Boolean bool = this._sessionContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.x()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final String y() {
        String str = this._trackerVersionSuffix;
        if (str != null) {
            return str;
        }
        nqf nqfVar = this.sourceConfig;
        if (nqfVar != null) {
            return nqfVar.y();
        }
        return null;
    }

    public final boolean z() {
        Boolean bool = this._userAnonymisation;
        if (bool != null) {
            return bool.booleanValue();
        }
        nqf nqfVar = this.sourceConfig;
        Boolean boolValueOf = nqfVar != null ? Boolean.valueOf(nqfVar.z()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
