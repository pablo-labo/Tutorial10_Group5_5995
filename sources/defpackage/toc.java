package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class toc extends SwitchCompat {
    public boolean L0;
    public Integer M0;
    public Integer N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toc(Context context) {
        super(context, null);
        context.getClass();
        this.L0 = true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{i}), new ColorDrawable(i), null));
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.L0 || isChecked() == z) {
            super.setChecked(isChecked());
            return;
        }
        this.L0 = false;
        super.setChecked(z);
        setTrackColor(z);
    }

    public final void setOn(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            setTrackColor(z);
        }
        this.L0 = true;
    }

    public final void setThumbColor(Integer num) {
        Drawable thumbDrawable = super.getThumbDrawable();
        thumbDrawable.getClass();
        if (num == null) {
            thumbDrawable.clearColorFilter();
        } else {
            thumbDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY));
        }
        if (num == null || !(getBackground() instanceof RippleDrawable)) {
            return;
        }
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{num.intValue()});
        Drawable background = getBackground();
        background.getClass();
        ((RippleDrawable) background).setColor(colorStateList);
    }

    public final void setTrackColor(Integer num) {
        Drawable trackDrawable = super.getTrackDrawable();
        trackDrawable.getClass();
        if (num == null) {
            trackDrawable.clearColorFilter();
        } else {
            trackDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void setTrackColorForFalse(Integer num) {
        if (wl7.b(num, this.M0)) {
            return;
        }
        this.M0 = num;
        if (isChecked()) {
            return;
        }
        setTrackColor(this.M0);
    }

    public final void setTrackColorForTrue(Integer num) {
        if (wl7.b(num, this.N0)) {
            return;
        }
        this.N0 = num;
        if (isChecked()) {
            setTrackColor(this.N0);
        }
    }

    private final void setTrackColor(boolean z) {
        Integer num = this.N0;
        if (num == null && this.M0 == null) {
            return;
        }
        if (!z) {
            num = this.M0;
        }
        setTrackColor(num);
    }
}
