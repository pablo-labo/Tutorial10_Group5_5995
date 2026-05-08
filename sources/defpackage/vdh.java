package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class vdh extends ja6 {
    public final GoogleSignInOptions B;

    public vdh(Context context, Looper looper, w72 w72Var, GoogleSignInOptions googleSignInOptions, y9h y9hVar, y9h y9hVar2) {
        GoogleSignInOptions.a aVar;
        super(context, looper, 91, w72Var, y9hVar, y9hVar2);
        Set<Scope> set = w72Var.c;
        if (googleSignInOptions != null) {
            aVar = new GoogleSignInOptions.a();
            aVar.a = new HashSet();
            aVar.h = new HashMap();
            aVar.a = new HashSet(googleSignInOptions.b);
            aVar.b = googleSignInOptions.e;
            aVar.c = googleSignInOptions.f;
            aVar.d = googleSignInOptions.d;
            aVar.e = googleSignInOptions.V;
            aVar.f = googleSignInOptions.c;
            aVar.g = googleSignInOptions.W;
            aVar.h = GoogleSignInOptions.R0(googleSignInOptions.X);
            aVar.i = googleSignInOptions.Y;
        } else {
            aVar = new GoogleSignInOptions.a();
            aVar.a = new HashSet();
            aVar.h = new HashMap();
        }
        aVar.i = odh.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.a;
        if (hashSet2.contains(GoogleSignInOptions.d0)) {
            Scope scope2 = GoogleSignInOptions.c0;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.b0);
        }
        this.B = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f, aVar.d, aVar.b, aVar.c, aVar.e, aVar.g, aVar.h, aVar.i);
    }

    @Override // defpackage.g91
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof teh ? (teh) iInterfaceQueryLocalInterface : new teh(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // defpackage.g91
    public final String j() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.g91
    public final String k() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // defpackage.g91, vf0.f
    public final int y0() {
        return 12451000;
    }
}
