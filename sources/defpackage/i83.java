package defpackage;

import android.net.Uri;
import android.webkit.CookieManager;
import defpackage.c87;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i83 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i83(jhf jhfVar, Function1 function1, kcf kcfVar, Function1 function12, g4a g4aVar) {
        this.b = jhfVar;
        this.c = function1;
        this.d = kcfVar;
        this.e = function12;
        this.f = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj6;
                String str2 = (String) obj5;
                CookieManager cookieManager = (CookieManager) obj2;
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                y3bVar.b("ctk_from_init", str);
                ez2 ez2Var = ez2.b;
                if (str2 == null) {
                    y3bVar.b("ctk_from_primary_before", "");
                } else {
                    y3bVar.b("ctk_from_primary_before", str2);
                    pxc pxcVar = b87.a;
                    b87.c(cookieManager, str3, "CTK", "/", str4);
                    d2f d2fVar = c87.a;
                    StringBuilder sb = new StringBuilder("https://");
                    sb.append(str4);
                    sb.append("/");
                    y3bVar.a(c87.a.b(cookieManager, sb.toString(), ez2Var) == null ? 1L : 0L, "temp_primary_deletion_success");
                }
                y3bVar.b("mobile_homepage_url", str3);
                d2f d2fVar2 = c87.a;
                String strB = c87.a.b(cookieManager, str3, ez2Var);
                if (strB == null) {
                    y3bVar.b("ctk_from_subdomain", "");
                } else {
                    y3bVar.b("ctk_from_subdomain", strB);
                    Uri uri = Uri.parse(str3);
                    String host = uri.getHost();
                    if (host == null) {
                        host = "";
                    }
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    for (String str5 : ut0.I0(new String[]{"/", zve.d0(path, "/")})) {
                        pxc pxcVar2 = b87.a;
                        b87.c(cookieManager, str3, "CTK", str5, host);
                    }
                    d2f d2fVar3 = c87.a;
                    y3bVar.a(c87.a.b(cookieManager, str3, ez2Var) == null ? 1L : 0L, "subdomain_deletion_success");
                }
                dd4 dd4Var = dd4.a;
                if (dd4.c()) {
                    xh8 xh8Var = j83.a;
                    d2f d2fVar4 = c87.a;
                    c87.a.d(ez2Var, str);
                } else {
                    pxc pxcVar3 = b87.a;
                    b87.g(cookieManager, str3, "CTK", str);
                }
                cookieManager.flush();
                d2f d2fVar5 = c87.a;
                String strB2 = c87.a.b(cookieManager, "https://" + str4 + "/", ez2Var);
                y3bVar.a(str.equals(strB2) ? 1L : 0L, "primary_ctk_set_success");
                y3bVar.b("ctk_from_primary_after", strB2 != null ? strB2 : "");
                break;
            default:
                jhf jhfVar = (jhf) obj6;
                Function1 function1 = (Function1) obj5;
                kcf kcfVar = (kcf) obj4;
                Function1 function12 = (Function1) obj3;
                g4a g4aVar = (g4a) obj2;
                jhf jhfVar2 = (jhf) obj;
                jhfVar2.getClass();
                String str6 = jhfVar.a.b;
                le0 le0Var = jhfVar2.a;
                String str7 = le0Var.b;
                long j = jhfVar2.b;
                int i2 = kjf.c;
                int i3 = (int) (j >> 32);
                if (wl7.b(str6, str7)) {
                    pxc pxcVar4 = qw6.a;
                    if (((Boolean) g4aVar.getValue()).booleanValue()) {
                        function1.invoke(jhfVar2);
                    } else {
                        int length = le0Var.b.length();
                        function1.invoke(jhf.a(jhfVar2, null, cr8.c(length, length), 5));
                    }
                } else {
                    pxc pxcVar5 = qw6.a;
                    boolean z = str7.length() > str6.length();
                    Character chY0 = awe.y0(str7, i3 - 1);
                    boolean z2 = chY0 != null && chY0.charValue() == '\n';
                    if (z && z2) {
                        jhfVar2 = qw6.d(str7, i3, kcfVar, function12);
                    } else if (str7.length() < str6.length()) {
                        String str8 = jhfVar.a.b;
                        int i4 = (int) (jhfVar.b >> 32);
                        String strF = qw6.f((String) new ArrayList(zve.k0(str8, new String[]{"\n"})).get(zve.k0(str8.substring(0, i4), new String[]{"\n"}).size() - 1));
                        int iV = zve.V(str8.substring(0, i4), '\n', 0, 6) + 1;
                        if (strF.length() > 0 && i4 == strF.length() + iV) {
                            function12.invoke(kcf.c);
                            String string = zve.c0(str8, iV, strF.length() + iV).toString();
                            int length2 = i4 - strF.length();
                            jhfVar2 = new jhf(string, cr8.c(length2, length2), 4);
                        }
                    }
                    function1.invoke(jhfVar2);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ i83(CookieManager cookieManager, String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.f = cookieManager;
        this.d = str3;
        this.e = str4;
    }
}
