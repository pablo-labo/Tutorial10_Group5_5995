package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.vf1;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class suc extends dpe {
    public static final g a;
    public static final zoe b;
    public static final bpe c;
    public static final ape d;
    private static final long serialVersionUID = -5457115500604085043L;
    private String affiliateKey;
    private String fbclid;
    private String from;
    private String gclid;
    private String host;
    private String keywords;
    private String newCookieValue;
    private String refTime;
    private String refType;
    private String referrer;
    private String reqAffiliateKey;
    private String reqKeywords;
    private String reqRefType;
    private Map<String, r98> utm_properties;

    public static class a extends epe<suc> {
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public LinkedHashMap r;

        public final suc c() {
            boolean[] zArr = this.c;
            try {
                suc sucVar = new suc();
                boolean z = zArr[0];
                g.f[] fVarArr = this.b;
                sucVar.affiliateKey = z ? this.e : (String) a(fVarArr[0]);
                sucVar.keywords = zArr[1] ? this.f : (String) a(fVarArr[1]);
                sucVar.newCookieValue = zArr[2] ? this.g : (String) a(fVarArr[2]);
                sucVar.referrer = zArr[3] ? this.h : (String) a(fVarArr[3]);
                sucVar.host = zArr[4] ? this.i : (String) a(fVarArr[4]);
                sucVar.refType = zArr[5] ? this.j : (String) a(fVarArr[5]);
                sucVar.refTime = zArr[6] ? this.k : (String) a(fVarArr[6]);
                sucVar.reqAffiliateKey = zArr[7] ? this.l : (String) a(fVarArr[7]);
                sucVar.reqKeywords = zArr[8] ? this.m : (String) a(fVarArr[8]);
                sucVar.reqRefType = zArr[9] ? this.n : (String) a(fVarArr[9]);
                sucVar.from = zArr[10] ? this.o : (String) a(fVarArr[10]);
                sucVar.fbclid = zArr[11] ? this.p : (String) a(fVarArr[11]);
                sucVar.gclid = zArr[12] ? this.q : (String) a(fVarArr[12]);
                sucVar.utm_properties = zArr[13] ? this.r : (Map) a(fVarArr[13]);
                return sucVar;
            } catch (AvroMissingFieldException e) {
                throw e;
            } catch (Exception e2) {
                throw new AvroRuntimeException(e2);
            }
        }
    }

    static {
        g gVarD = j6.d("{\"type\":\"record\",\"name\":\"ReferralParams\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"fields\":[{\"name\":\"affiliateKey\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The affiliate key for the referral. (AFF in the cookie) This maps to the SID parameter in the log entries.\"},{\"name\":\"keywords\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The keywords used for attribution. (KW in the cookie)\"},{\"name\":\"newCookieValue\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The encrypted value for the RF cookie. Mobile applications should put this value in the RF cookie\\nin the device's cookie store. Note that may change from what was set in the input.\"},{\"name\":\"referrer\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The referrer URL for REF types.\"},{\"name\":\"host\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The host of the \\\"page\\\" of the request for referrals. For native apps, you should pass\\nin the hostname of the Home Page url.\"},{\"name\":\"refType\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The calculated type of the referral.\"},{\"name\":\"refTime\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"Timestamp of this referral calculation.\"},{\"name\":\"reqAffiliateKey\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If there was an existing cookie, the original affiliate key. (AFF)\"},{\"name\":\"reqKeywords\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If there were existing cookie, the original keywords. (KW)\"},{\"name\":\"reqRefType\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"If there was an existing cookie, the original refType.\"},{\"name\":\"from\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"fbclid\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"gclid\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"utm_properties\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"JsmaDynamicProperty\",\"fields\":[{\"name\":\"property\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"},\"long\"]}]},\"avro.java.string\":\"String\"}],\"default\":null}]}");
        a = gVarD;
        zoe zoeVar = new zoe();
        b = zoeVar;
        new vf1.a(zoeVar, gVarD);
        new uf1(zoeVar, gVarD);
        c = new bpe(gVarD, zoeVar);
        d = new ape(gVarD, gVarD, zoeVar);
    }

    @Override // defpackage.xw5
    public final g a() {
        return a;
    }

    @Override // defpackage.la7
    public final void c(int i, Object obj) {
        switch (i) {
            case 0:
                this.affiliateKey = obj != null ? obj.toString() : null;
                break;
            case 1:
                this.keywords = obj != null ? obj.toString() : null;
                break;
            case 2:
                this.newCookieValue = obj != null ? obj.toString() : null;
                break;
            case 3:
                this.referrer = obj != null ? obj.toString() : null;
                break;
            case 4:
                this.host = obj != null ? obj.toString() : null;
                break;
            case 5:
                this.refType = obj != null ? obj.toString() : null;
                break;
            case 6:
                this.refTime = obj != null ? obj.toString() : null;
                break;
            case 7:
                this.reqAffiliateKey = obj != null ? obj.toString() : null;
                break;
            case 8:
                this.reqKeywords = obj != null ? obj.toString() : null;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                this.reqRefType = obj != null ? obj.toString() : null;
                break;
            case 10:
                this.from = obj != null ? obj.toString() : null;
                break;
            case 11:
                this.fbclid = obj != null ? obj.toString() : null;
                break;
            case 12:
                this.gclid = obj != null ? obj.toString() : null;
                break;
            case 13:
                this.utm_properties = (Map) obj;
                break;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                break;
        }
    }

    @Override // defpackage.la7
    public final Object get(int i) {
        switch (i) {
            case 0:
                return this.affiliateKey;
            case 1:
                return this.keywords;
            case 2:
                return this.newCookieValue;
            case 3:
                return this.referrer;
            case 4:
                return this.host;
            case 5:
                return this.refType;
            case 6:
                return this.refTime;
            case 7:
                return this.reqAffiliateKey;
            case 8:
                return this.reqKeywords;
            case DatadogLogGenerator.CRASH /* 9 */:
                return this.reqRefType;
            case 10:
                return this.from;
            case 11:
                return this.fbclid;
            case 12:
                return this.gclid;
            case 13:
                return this.utm_properties;
            default:
                l5.s(p6.c(i, "Invalid index: "));
                return null;
        }
    }

    @Override // defpackage.dpe
    public final zoe m() {
        return b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        d.j(this, zoe.w(objectInput));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        c.c(this, zoe.x(objectOutput));
    }
}
