package okhttp3.internal.http2;

import defpackage.vr1;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Header {
    public static final vr1 d;
    public static final vr1 e;
    public static final vr1 f;
    public static final vr1 g;
    public static final vr1 h;
    public static final vr1 i;
    public final vr1 a;
    public final vr1 b;
    public final int c;

    static {
        new Companion(0);
        vr1 vr1Var = vr1.c;
        d = vr1.a.c(":");
        e = vr1.a.c(":status");
        f = vr1.a.c(":method");
        g = vr1.a.c(":path");
        h = vr1.a.c(":scheme");
        i = vr1.a.c(":authority");
    }

    public Header(vr1 vr1Var, vr1 vr1Var2) {
        vr1Var.getClass();
        vr1Var2.getClass();
        this.a = vr1Var;
        this.b = vr1Var2;
        this.c = vr1Var2.h() + vr1Var.h() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return wl7.b(this.a, header.a) && wl7.b(this.b, header.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.A() + ": " + this.b.A();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "<init>", "()V", "Lvr1;", "PSEUDO_PREFIX", "Lvr1;", "RESPONSE_STATUS", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(vr1.a.c(str), vr1.a.c(str2));
        str.getClass();
        str2.getClass();
        vr1 vr1Var = vr1.c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(vr1 vr1Var, String str) {
        this(vr1Var, vr1.a.c(str));
        vr1Var.getClass();
        str.getClass();
        vr1 vr1Var2 = vr1.c;
    }
}
