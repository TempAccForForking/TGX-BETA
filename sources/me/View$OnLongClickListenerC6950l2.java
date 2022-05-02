package me;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import be.C1379j0;
import be.C1399s0;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p111he.C5132o;
import p364zd.C11524j;

public class View$OnLongClickListenerC6950l2 extends C7029t0 implements InputFilter, View.OnLongClickListener {
    public int f21948M;
    public boolean f21949N;
    public boolean f21950O = true;
    public String f21951c;

    public class ActionMode$CallbackC6951a implements ActionMode.Callback {
        public ActionMode$CallbackC6951a() {
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public View$OnLongClickListenerC6950l2(Context context) {
        super(context);
        setInputType(524289);
        setFilters(new InputFilter[]{this});
        setCustomSelectionActionModeCallback(new ActionMode$CallbackC6951a());
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f21949N) {
            return null;
        }
        if (!this.f21950O) {
            if (charSequence.length() >= 1) {
                return "";
            }
        } else if (this.f21951c == null || i3 >= this.f21948M) {
            return null;
        }
        return spanned.subSequence(i3, i4);
    }

    public String getSuffix() {
        String obj = getText().toString();
        int length = obj.length();
        int i = this.f21948M;
        return length <= i ? "" : obj.substring(i);
    }

    @Override
    public boolean onLongClick(View view) {
        C1379j0.m37328i(getText().toString(), R.string.CopiedLink);
        return true;
    }

    @Override
    public void onSelectionChanged(int i, int i2) {
        if (this.f21950O && i < this.f21948M) {
            int length = getText().length();
            int i3 = this.f21948M;
            if (length >= i3) {
                C1399s0.m37172m0(this, i3);
                return;
            }
        }
        super.onSelectionChanged(i, i2);
    }

    public void setEditable(boolean z) {
        if (this.f21950O != z) {
            this.f21950O = z;
            setClickable(z);
            setFocusable(z);
            setFocusableInTouchMode(z);
            setOnLongClickListener(z ? null : this);
        }
    }

    public void setPrefix(int i) {
        setPrefix(C4403w.m27871i1(i));
    }

    public void setSuffix(String str) {
        SpannableString spannableString = new SpannableString(this.f21951c + str);
        if (this.f21951c.length() > 0) {
            spannableString.setSpan(new ForegroundColorSpan(C11524j.m207X0()), 0, this.f21951c.length(), 33);
        }
        m18386z(spannableString);
        C1399s0.m37172m0(this, spannableString.length());
    }

    public void m18386z(Spannable spannable) {
        this.f21949N = true;
        setText(spannable, TextView.BufferType.SPANNABLE);
        this.f21949N = false;
    }

    public void setPrefix(String str) {
        this.f21951c = str;
        SpannableString spannableString = new SpannableString(str);
        if (str.length() > 0) {
            spannableString.setSpan(new C5132o(null, R.id.theme_color_textPlaceholder), 0, str.length(), 33);
        }
        this.f21948M = spannableString.length();
        m18386z(spannableString);
        C1399s0.m37172m0(this, this.f21948M);
    }
}
