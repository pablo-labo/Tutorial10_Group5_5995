package defpackage;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.q0d;
import defpackage.t9b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sla {
    public final Context a;
    public final Notification.Builder b;
    public final pla c;
    public final Bundle d;

    public static class a {
        public static void a(Notification.Builder builder, Person person) {
            builder.addPerson(person);
        }

        public static void b(Notification.Action.Builder builder) {
            builder.setSemanticAction(0);
        }
    }

    public static class b {
        public static void a(Notification.Builder builder, boolean z) {
            builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static void b(Notification.Builder builder) {
            builder.setBubbleMetadata(null);
        }

        public static void c(Notification.Action.Builder builder) {
            builder.setContextual(false);
        }
    }

    public static class c {
        public static void a(Notification.Action.Builder builder) {
            builder.setAuthenticationRequired(false);
        }

        public static void b(Notification.Builder builder, int i) {
            builder.setForegroundServiceBehavior(i);
        }
    }

    public sla(pla plaVar) {
        ArrayList<t9b> arrayList;
        int i;
        Bundle[] bundleArr;
        ArrayList<t9b> arrayList2;
        ArrayList<mla> arrayList3;
        int i2;
        ArrayList<String> arrayList4;
        new ArrayList();
        this.d = new Bundle();
        this.c = plaVar;
        Context context = plaVar.a;
        ArrayList<String> arrayList5 = plaVar.x;
        ArrayList<t9b> arrayList6 = plaVar.c;
        ArrayList<mla> arrayList7 = plaVar.d;
        this.a = context;
        Notification.Builder builder = new Notification.Builder(context, plaVar.t);
        this.b = builder;
        Notification notification = plaVar.w;
        Resources resources = null;
        int i3 = 2;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(plaVar.e).setContentText(plaVar.f).setContentInfo(null).setContentIntent(plaVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0).setNumber(plaVar.i).setProgress(0, 0, false);
        IconCompat iconCompat = plaVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.e(context));
        builder.setSubText(null).setUsesChronometer(plaVar.l).setPriority(plaVar.j);
        rla rlaVar = plaVar.m;
        if (rlaVar instanceof qla) {
            qla qlaVar = (qla) rlaVar;
            int color = qlaVar.a.a.getColor(R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) qlaVar.a.a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = qlaVar.a.a;
            PorterDuff.Mode mode = IconCompat.k;
            context2.getClass();
            IconCompat iconCompatA = IconCompat.a(context2.getResources(), context2.getPackageName(), R.drawable.ic_call_decline);
            Bundle bundle = new Bundle();
            CharSequence charSequenceB = pla.b(spannableStringBuilder);
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            if (!arrayList8.isEmpty()) {
            }
            mla mlaVar = new mla(iconCompatA, charSequenceB, null, bundle, arrayList9.isEmpty() ? null : (q0d[]) arrayList9.toArray(new q0d[arrayList9.size()]));
            mlaVar.a.putBoolean("key_action_priority", true);
            ArrayList arrayList10 = new ArrayList(3);
            arrayList10.add(mlaVar);
            ArrayList<mla> arrayList11 = qlaVar.a.b;
            if (arrayList11 != null) {
                for (mla mlaVar2 : arrayList11) {
                    mlaVar2.getClass();
                    if (!mlaVar2.a.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList10.add(mlaVar2);
                        i3--;
                    }
                }
            }
            Iterator it = arrayList10.iterator();
            while (it.hasNext()) {
                a((mla) it.next());
            }
        } else {
            Iterator<mla> it2 = plaVar.b.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
        }
        Bundle bundle2 = plaVar.q;
        if (bundle2 != null) {
            this.d.putAll(bundle2);
        }
        this.b.setShowWhen(plaVar.k);
        this.b.setLocalOnly(plaVar.o);
        this.b.setGroup(plaVar.n);
        this.b.setSortKey(null);
        this.b.setGroupSummary(false);
        this.b.setCategory(plaVar.p);
        this.b.setColor(plaVar.r);
        this.b.setVisibility(plaVar.s);
        this.b.setPublicVersion(null);
        this.b.setSound(notification.sound, notification.audioAttributes);
        String str = "";
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList6 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList<>(arrayList6.size());
                Iterator<t9b> it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                    arrayList4.add("");
                }
            }
            if (arrayList4 != null) {
                if (arrayList5 == null) {
                    arrayList5 = arrayList4;
                } else {
                    ot0 ot0Var = new ot0(arrayList5.size() + arrayList4.size());
                    ot0Var.addAll(arrayList4);
                    ot0Var.addAll(arrayList5);
                    arrayList5 = new ArrayList<>(ot0Var);
                }
            }
        }
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Iterator<String> it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                this.b.addPerson(it4.next());
            }
        }
        if (arrayList7.size() > 0) {
            if (plaVar.q == null) {
                plaVar.q = new Bundle();
            }
            Bundle bundle3 = plaVar.q.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i4 = 0;
            while (i4 < arrayList7.size()) {
                String string = Integer.toString(i4);
                mla mlaVar3 = arrayList7.get(i4);
                Bundle bundle6 = new Bundle();
                if (mlaVar3.b == null && (i2 = mlaVar3.f) != 0) {
                    mlaVar3.b = IconCompat.a(resources, str, i2);
                }
                IconCompat iconCompat2 = mlaVar3.b;
                Bundle bundle7 = mlaVar3.a;
                bundle6.putInt("icon", iconCompat2 != null ? iconCompat2.b() : 0);
                bundle6.putCharSequence("title", mlaVar3.g);
                bundle6.putParcelable("actionIntent", mlaVar3.h);
                Bundle bundle8 = bundle7 != null ? new Bundle(bundle7) : new Bundle();
                bundle8.putBoolean("android.support.allowGeneratedReplies", mlaVar3.d);
                bundle6.putBundle("extras", bundle8);
                q0d[] q0dVarArr = mlaVar3.c;
                if (q0dVarArr == null) {
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[q0dVarArr.length];
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList7;
                    int i5 = 0;
                    while (i5 < q0dVarArr.length) {
                        q0d q0dVar = q0dVarArr[i5];
                        int i6 = i5;
                        Bundle bundle9 = new Bundle();
                        q0dVar.getClass();
                        bundle9.putString("resultKey", null);
                        bundle9.putCharSequence("label", null);
                        bundle9.putCharSequenceArray("choices", null);
                        bundle9.putBoolean("allowFreeFormInput", false);
                        bundle9.putBundle("extras", null);
                        bundleArr[i6] = bundle9;
                        i5 = i6 + 1;
                        str = str;
                        q0dVarArr = q0dVarArr;
                    }
                }
                String str2 = str;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", mlaVar3.e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i4++;
                arrayList6 = arrayList2;
                arrayList7 = arrayList3;
                str = str2;
                resources = null;
            }
            arrayList = arrayList6;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (plaVar.q == null) {
                plaVar.q = new Bundle();
            }
            plaVar.q.putBundle("android.car.EXTENSIONS", bundle3);
            this.d.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList6;
        }
        this.b.setExtras(plaVar.q);
        this.b.setRemoteInputHistory(null);
        this.b.setBadgeIconType(0);
        this.b.setSettingsText(null);
        this.b.setShortcutId(null);
        this.b.setTimeoutAfter(0L);
        this.b.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(plaVar.t)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            for (t9b t9bVar : arrayList) {
                Notification.Builder builder2 = this.b;
                t9bVar.getClass();
                a.a(builder2, t9b.a.a(t9bVar));
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            b.a(this.b, plaVar.v);
            b.b(this.b);
        }
        if (i7 < 31 || (i = plaVar.u) == 0) {
            return;
        }
        c.b(this.b, i);
    }

    public final void a(mla mlaVar) {
        int i;
        if (mlaVar.b == null && (i = mlaVar.f) != 0) {
            mlaVar.b = IconCompat.a(null, "", i);
        }
        IconCompat iconCompat = mlaVar.b;
        boolean z = mlaVar.d;
        Bundle bundle = mlaVar.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.e(null) : null, mlaVar.g, mlaVar.h);
        q0d[] q0dVarArr = mlaVar.c;
        if (q0dVarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[q0dVarArr.length];
            for (int i2 = 0; i2 < q0dVarArr.length; i2++) {
                q0dVarArr[i2].getClass();
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    q0d.a.a(builderAddExtras);
                }
                remoteInputArr[i2] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            a.b(builder);
        }
        if (i3 >= 29) {
            b.c(builder);
        }
        if (i3 >= 31) {
            c.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", mlaVar.e);
        builder.addExtras(bundle2);
        this.b.addAction(builder.build());
    }
}
