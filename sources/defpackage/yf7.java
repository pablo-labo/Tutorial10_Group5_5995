package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.fn6;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yf7 extends v1 {
    public int b = 0;
    public final Context c;
    public fn6 d;
    public a e;

    public final class a implements ServiceConnection {
        public final ag7 a;

        public a(ag7 ag7Var) {
            this.a = ag7Var;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            fn6 c0235a;
            ojh.s("Install Referrer service connected.");
            int i = fn6.a.b;
            if (iBinder == null) {
                c0235a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c0235a = iInterfaceQueryLocalInterface instanceof fn6 ? (fn6) iInterfaceQueryLocalInterface : new fn6.a.C0235a(iBinder);
            }
            yf7 yf7Var = yf7.this;
            yf7Var.d = c0235a;
            yf7Var.b = 2;
            this.a.c(0);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            ojh.t("Install Referrer service disconnected.");
            yf7 yf7Var = yf7.this;
            yf7Var.d = null;
            yf7Var.b = 0;
        }
    }

    public yf7(Context context) {
        this.c = context.getApplicationContext();
    }

    public final tuc w0() throws RemoteException {
        if (this.b != 2 || this.d == null || this.e == null) {
            r6.g("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.c.getPackageName());
        try {
            return new tuc(this.d.c(bundle));
        } catch (RemoteException e) {
            ojh.t("RemoteException getting install referrer information");
            this.b = 0;
            throw e;
        }
    }

    public final void x0(ag7 ag7Var) {
        ServiceInfo serviceInfo;
        int i = this.b;
        if (i == 2 && this.d != null && this.e != null) {
            ojh.s("Service connection is valid. No need to re-initialize.");
            ag7Var.c(0);
            return;
        }
        if (i == 1) {
            ojh.t("Client is already in the process of connecting to the service.");
            ag7Var.c(3);
            return;
        }
        if (i == 3) {
            ojh.t("Client was already closed and can't be reused. Please create another instance.");
            ag7Var.c(3);
            return;
        }
        ojh.s("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.c;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.b = 0;
            ojh.s("Install Referrer service unavailable on device.");
            ag7Var.c(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    a aVar = new a(ag7Var);
                    this.e = aVar;
                    try {
                        if (context.bindService(intent2, aVar, 1)) {
                            ojh.s("Service was bonded successfully.");
                            return;
                        }
                        ojh.t("Connection to service is blocked.");
                        this.b = 0;
                        ag7Var.c(1);
                        return;
                    } catch (SecurityException unused) {
                        ojh.t("No permission to connect to service.");
                        this.b = 0;
                        ag7Var.c(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        ojh.t("Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.b = 0;
        ag7Var.c(2);
    }
}
