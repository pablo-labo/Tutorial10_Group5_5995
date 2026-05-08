package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kch extends nv8 implements DialogInterface.OnCancelListener {
    public volatile boolean a;
    public final AtomicReference b;
    public final och c;
    public final na6 d;

    public kch(vv8 vv8Var, na6 na6Var) {
        super(vv8Var);
        this.b = new AtomicReference(null);
        this.c = new och(Looper.getMainLooper());
        this.d = na6Var;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        ((k9h) this).f.g(connectionResult, i);
    }

    @Override // defpackage.nv8
    public final void onActivityResult(int i, int i2, Intent intent) {
        AtomicReference atomicReference = this.b;
        ach achVar = (ach) atomicReference.get();
        if (i != 1) {
            if (i == 2) {
                int iC = this.d.c(getActivity(), oa6.a);
                if (iC == 0) {
                    atomicReference.set(null);
                    och ochVar = ((k9h) this).f.c0;
                    ochVar.sendMessage(ochVar.obtainMessage(3));
                    return;
                } else {
                    if (achVar == null) {
                        return;
                    }
                    if (achVar.b.b == 18 && iC == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            och ochVar2 = ((k9h) this).f.c0;
            ochVar2.sendMessage(ochVar2.obtainMessage(3));
            return;
        } else if (i2 == 0) {
            if (achVar != null) {
                a(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, achVar.b.toString()), achVar.a);
                return;
            }
            return;
        }
        if (achVar != null) {
            a(achVar.b, achVar.a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null, null);
        ach achVar = (ach) this.b.get();
        a(connectionResult, achVar == null ? -1 : achVar.a);
    }

    @Override // defpackage.nv8
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new ach(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // defpackage.nv8
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ach achVar = (ach) this.b.get();
        if (achVar == null) {
            return;
        }
        ConnectionResult connectionResult = achVar.b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", achVar.a);
        bundle.putInt("failed_status", connectionResult.b);
        bundle.putParcelable("failed_resolution", connectionResult.c);
    }

    @Override // defpackage.nv8
    public void onStart() {
        super.onStart();
        this.a = true;
    }

    @Override // defpackage.nv8
    public void onStop() {
        super.onStop();
        this.a = false;
    }
}
