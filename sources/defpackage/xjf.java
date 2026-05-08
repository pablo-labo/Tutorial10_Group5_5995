package defpackage;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final class xjf {
    public static void a(Menu menu, int i, final Context context, final TextClassification textClassification, int i2) {
        if (i2 < 0) {
            MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(textClassification.getIcon());
            menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: vjf
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                    TextClassification textClassification2 = textClassification;
                    String text = textClassification2.getText();
                    PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                    if (Build.VERSION.SDK_INT >= 34) {
                        scf.a(activity);
                        return true;
                    }
                    activity.send();
                    return true;
                }
            });
            return;
        }
        boolean z = i2 == 0;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, z ? 16908353 : 0, i, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(z ? 2 : 0);
        if (z || remoteAction.shouldShowIcon()) {
            menuItemAdd2.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: wjf
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                PendingIntent actionIntent = remoteAction.getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    scf.a(actionIntent);
                    return true;
                }
                actionIntent.send();
                return true;
            }
        });
    }
}
