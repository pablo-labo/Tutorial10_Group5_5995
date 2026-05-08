package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.RingtoneManager;

/* JADX INFO: loaded from: classes2.dex */
public enum bd4 {
    a(56, "InboxPushAlert", "inbox_push_alert", null),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(52, "InvitationToApply", "invitation_to_apply", "BabyEI2A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(52, "ForcedUpgrade", "forced_upgrade", "forced_upgrade"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(52, "JobAlert", "job_alert", "job_alert"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(52, "InterviewReminder", "jsinterview_reminder", "jsinterview_reminder"),
    b(60, "Others", "fcm_channel_id_01", null);

    private final boolean canBypassDnd;
    private final String channelId;
    private final int displayNameResId;
    private final String id;
    private final Integer notificationId;
    private final boolean useRingtone;

    bd4() {
        throw null;
    }

    bd4(int i, String str, String str2, String str3) {
        Integer num = (i & 4) != 0 ? null : 14;
        str3 = (i & 8) != 0 ? null : str3;
        this.id = str2;
        this.displayNameResId = i;
        this.notificationId = num;
        this.channelId = str3;
        this.canBypassDnd = false;
        this.useRingtone = false;
    }

    public final String a() {
        return this.channelId;
    }

    public final Integer c() {
        return this.notificationId;
    }

    public final void e(Context context) {
        tla tlaVar = new tla(context);
        CharSequence text = context.getText(this.displayNameResId);
        text.getClass();
        NotificationChannel notificationChannel = new NotificationChannel(this.id, text, 4);
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16776961);
        notificationChannel.enableVibration(true);
        notificationChannel.setVibrationPattern(new long[]{0, 250, 250, 250});
        notificationChannel.setShowBadge(true);
        if (this.canBypassDnd) {
            notificationChannel.setBypassDnd(true);
        }
        if (this.useRingtone) {
            notificationChannel.setSound(RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(6).build());
        }
        tlaVar.b.createNotificationChannel(notificationChannel);
    }

    public final String getId() {
        return this.id;
    }
}
