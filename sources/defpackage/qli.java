package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzae;
import defpackage.tn6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qli extends noh implements xli {
    public qli() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static xli asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof xli ? (xli) iInterfaceQueryLocalInterface : new nmi(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.noh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        gmi umiVar = null;
        gmi umiVar2 = null;
        gmi umiVar3 = null;
        igh ughVar = null;
        igh ughVar2 = null;
        igh ughVar3 = null;
        gmi umiVar4 = null;
        gmi umiVar5 = null;
        gmi umiVar6 = null;
        gmi umiVar7 = null;
        gmi umiVar8 = null;
        gmi umiVar9 = null;
        pgh ghhVar = null;
        gmi umiVar10 = null;
        gmi umiVar11 = null;
        gmi umiVar12 = null;
        gmi umiVar13 = null;
        gmi umiVar14 = null;
        switch (i) {
            case 1:
                initialize(tn6.a.e(parcel.readStrongBinder()), (zzae) nkh.a(parcel, zzae.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) nkh.a(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) nkh.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar = iInterfaceQueryLocalInterface instanceof gmi ? (gmi) iInterfaceQueryLocalInterface : new umi(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, umiVar, parcel.readLong());
                break;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                tn6 tn6VarE = tn6.a.e(parcel.readStrongBinder());
                ClassLoader classLoader = nkh.a;
                setUserProperty(string3, string4, tn6VarE, parcel.readInt() != 0, parcel.readLong());
                break;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ClassLoader classLoader2 = nkh.a;
                boolean z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar14 = iInterfaceQueryLocalInterface2 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface2 : new umi(strongBinder2);
                }
                getUserProperties(string5, string6, z, umiVar14);
                break;
            case 6:
                String string7 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar13 = iInterfaceQueryLocalInterface3 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface3 : new umi(strongBinder3);
                }
                getMaxUserProperties(string7, umiVar13);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) nkh.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) nkh.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar12 = iInterfaceQueryLocalInterface4 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface4 : new umi(strongBinder4);
                }
                getConditionalUserProperties(string8, string9, umiVar12);
                break;
            case 11:
                ClassLoader classLoader3 = nkh.a;
                setMeasurementEnabled(parcel.readInt() != 0, parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(tn6.a.e(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar11 = iInterfaceQueryLocalInterface5 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface5 : new umi(strongBinder5);
                }
                getCurrentScreenName(umiVar11);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar10 = iInterfaceQueryLocalInterface6 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface6 : new umi(strongBinder6);
                }
                getCurrentScreenClass(umiVar10);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    ghhVar = iInterfaceQueryLocalInterface7 instanceof pgh ? (pgh) iInterfaceQueryLocalInterface7 : new ghh(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider");
                }
                setInstanceIdProvider(ghhVar);
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar9 = iInterfaceQueryLocalInterface8 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface8 : new umi(strongBinder8);
                }
                getCachedAppInstanceId(umiVar9);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar8 = iInterfaceQueryLocalInterface9 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface9 : new umi(strongBinder9);
                }
                getAppInstanceId(umiVar8);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar7 = iInterfaceQueryLocalInterface10 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface10 : new umi(strongBinder10);
                }
                getGmpAppId(umiVar7);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar6 = iInterfaceQueryLocalInterface11 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface11 : new umi(strongBinder11);
                }
                generateEventId(umiVar6);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(tn6.a.e(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(tn6.a.e(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(tn6.a.e(parcel.readStrongBinder()), (Bundle) nkh.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(tn6.a.e(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(tn6.a.e(parcel.readStrongBinder()), parcel.readLong());
                break;
            case RendererMetrics.SAMPLES /* 30 */:
                onActivityResumed(tn6.a.e(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                tn6 tn6VarE2 = tn6.a.e(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar5 = iInterfaceQueryLocalInterface12 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface12 : new umi(strongBinder12);
                }
                onActivitySaveInstanceState(tn6VarE2, umiVar5, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) nkh.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar4 = iInterfaceQueryLocalInterface13 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface13 : new umi(strongBinder13);
                }
                performAction(bundle2, umiVar4, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), tn6.a.e(parcel.readStrongBinder()), tn6.a.e(parcel.readStrongBinder()), tn6.a.e(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    ughVar3 = iInterfaceQueryLocalInterface14 instanceof igh ? (igh) iInterfaceQueryLocalInterface14 : new ugh(strongBinder14);
                }
                setEventInterceptor(ughVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    ughVar2 = iInterfaceQueryLocalInterface15 instanceof igh ? (igh) iInterfaceQueryLocalInterface15 : new ugh(strongBinder15);
                }
                registerOnMeasurementEventListener(ughVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    ughVar = iInterfaceQueryLocalInterface16 instanceof igh ? (igh) iInterfaceQueryLocalInterface16 : new ugh(strongBinder16);
                }
                unregisterOnMeasurementEventListener(ughVar);
                break;
            case 37:
                initForTests(parcel.readHashMap(nkh.a));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar3 = iInterfaceQueryLocalInterface17 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface17 : new umi(strongBinder17);
                }
                getTestFlag(umiVar3, parcel.readInt());
                break;
            case 39:
                ClassLoader classLoader4 = nkh.a;
                setDataCollectionEnabled(parcel.readInt() != 0);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    umiVar2 = iInterfaceQueryLocalInterface18 instanceof gmi ? (gmi) iInterfaceQueryLocalInterface18 : new umi(strongBinder18);
                }
                isDataCollectionEnabled(umiVar2);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) nkh.a(parcel, Bundle.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
