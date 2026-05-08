package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dxe implements do2 {
    private Integer _colorDepth;
    private String _domainUserId;
    private String _ipAddress;
    private String _language;
    private String _networkUserId;
    private jie _screenResolution;
    private jie _screenViewPort;
    private String _timezone;
    private Boolean _useContextResourcesScreenResolution;
    private String _userId;
    private String _useragent;
    private dxe sourceConfig;

    public final Integer a() {
        Integer num = this._colorDepth;
        if (num != null) {
            return num;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.a();
        }
        return null;
    }

    public final String b() {
        String str = this._domainUserId;
        if (str != null) {
            return str;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.b();
        }
        return null;
    }

    public final String c() {
        String str = this._ipAddress;
        if (str != null) {
            return str;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.c();
        }
        return null;
    }

    public final String d() {
        String str = this._language;
        if (str != null) {
            return str;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.d();
        }
        return null;
    }

    public final String e() {
        String str = this._networkUserId;
        if (str != null) {
            return str;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.e();
        }
        return null;
    }

    public final jie f() {
        jie jieVar = this._screenResolution;
        if (jieVar != null) {
            return jieVar;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.f();
        }
        return null;
    }

    public final jie g() {
        jie jieVar = this._screenViewPort;
        if (jieVar != null) {
            return jieVar;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.g();
        }
        return null;
    }

    public final String h() {
        String str = this._timezone;
        if (str != null) {
            return str;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.h();
        }
        return null;
    }

    public final boolean i() {
        Boolean bool = this._useContextResourcesScreenResolution;
        if (bool != null) {
            return bool.booleanValue();
        }
        dxe dxeVar = this.sourceConfig;
        Boolean boolValueOf = dxeVar != null ? Boolean.valueOf(dxeVar.i()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final String j() {
        String str = this._userId;
        if (str != null) {
            return str;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.j();
        }
        return null;
    }

    public final String k() {
        String str = this._useragent;
        if (str != null) {
            return str;
        }
        dxe dxeVar = this.sourceConfig;
        if (dxeVar != null) {
            return dxeVar.k();
        }
        return null;
    }

    public final void l(dxe dxeVar) {
        this.sourceConfig = dxeVar;
    }
}
