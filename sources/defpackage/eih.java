package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzae;
import defpackage.mhh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class eih extends mhh.a {
    public final /* synthetic */ mhh V;
    public final /* synthetic */ Context e;
    public final /* synthetic */ Bundle f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eih(mhh mhhVar, Context context, Bundle bundle) {
        super(true);
        this.V = mhhVar;
        this.e = context;
        this.f = bundle;
    }

    @Override // mhh.a
    public final void a() {
        xli xliVarAsInterface;
        boolean z;
        int iMax;
        Context context = this.e;
        mhh mhhVar = this.V;
        try {
            mhhVar.c = new ArrayList();
            mhh.d(context);
            boolean zBooleanValue = mhh.h.booleanValue();
            try {
                xliVarAsInterface = qli.asInterface(DynamiteModule.c(context, zBooleanValue ? DynamiteModule.d : DynamiteModule.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e) {
                mhhVar.b(e, true, false);
                xliVarAsInterface = null;
            }
            mhhVar.f = xliVarAsInterface;
            if (xliVarAsInterface == null) {
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            int iD = DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false);
            if (zBooleanValue) {
                iMax = Math.max(iA, iD);
                z = iD < iA;
            } else {
                if (iA > 0) {
                    iD = iA;
                }
                z = iA > 0;
                iMax = iD;
            }
            mhhVar.f.initialize(new vna(context), new zzae(29000L, iMax, z, null, null, null, this.f), this.a);
        } catch (Exception e2) {
            mhhVar.b(e2, true, false);
        }
    }
}
