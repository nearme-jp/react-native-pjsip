package com.carusto;

import android.content.Context;
import android.content.Intent;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

public class PjActions {

    public static final String TEST = "test";

    public static final String ACTION_START = "start";
    public static final String ACTION_CREATE_ACCOUNT = "account_create";
    public static final String ACTION_DELETE_ACCOUNT = "account_delete";
    public static final String ACTION_MAKE_CALL = "call_make";
    public static final String ACTION_HANGUP_CALL = "call_hangup";
    public static final String ACTION_ANSWER_CALL = "call_answer";
    public static final String ACTION_HOLD_CALL = "call_hold";
    public static final String ACTION_UNHOLD_CALL = "call_unhold";
    public static final String ACTION_MUTE_CALL = "call_mute";
    public static final String ACTION_UNMUTE_CALL = "call_unmute";
    public static final String ACTION_USE_SPEAKER_CALL = "call_use_speaker";
    public static final String ACTION_USE_EARPIECE_CALL = "call_use_earpiece";
    public static final String ACTION_XFER_CALL = "call_xfer";
    public static final String ACTION_XFER_REPLACES_CALL = "call_xfer_replace";
    public static final String ACTION_REDIRECT_CALL = "call_redirect";
    public static final String ACTION_DTMF_CALL = "call_dtmf";

    public static final String ACTION_START_FOREGROUND = "start_foreground";
    public static final String ACTION_STOP_FOREGROUND = "stop_foreground";

    public static final String EVENT_STARTED = "com.carusto.account.started";
    public static final String EVENT_ACCOUNT_CREATED = "com.carusto.account.created";
    public static final String EVENT_REGISTRATION_CHANGED = "com.carusto.registration.changed";
    public static final String EVENT_CALL_CREATED = "com.carusto.call.created";
    public static final String EVENT_CALL_CHANGED = "com.carusto.call.changed";
    public static final String EVENT_CALL_TERMINATED = "com.carusto.call.terminated";
    public static final String EVENT_CALL_RECEIVED = "com.carusto.call.received";
    public static final String EVENT_CALL_SCREEN_LOCKED = "com.carusto.call.screen.locked";
    public static final String EVENT_HANDLED = "com.carusto.handled";

    public static final String EVENT_APP_VISIBLE = "com.carusto.app.visible";
    public static final String EVENT_APP_HIDDEN = "com.carusto.app.hidden";

    public static Intent createAccountCreateIntent(int callbackId, ReadableMap configuration, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_CREATE_ACCOUNT);
        intent.putExtra("callback_id", callbackId);

        overrideIntentProps(intent, configuration);

        return intent;
    }

    public static Intent createAccountDeleteIntent(int callbackId, int accountId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_DELETE_ACCOUNT);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("account_id", accountId);

        return intent;
    }

    public static Intent createMakeCallIntent(int callbackId, int accountId, String destination, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_MAKE_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("account_id", accountId);
        intent.putExtra("destination", destination);

        return intent;
    }

    public static Intent createHangupCallIntent(int callbackId, int callId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_HANGUP_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);

        return intent;
    }

    public static Intent createAnswerCallIntent(int callbackId, int callId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_ANSWER_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);

        return intent;
    }

    public static Intent createHoldCallIntent(int callbackId, int callId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_HOLD_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);

        return intent;
    }

    public static Intent createUnholdCallIntent(int callbackId, int callId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_UNHOLD_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);

        return intent;
    }

    public static Intent createMuteCallIntent(int callbackId, int callId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_MUTE_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);

        return intent;
    }

    public static Intent createUnMuteCallIntent(int callbackId, int callId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_UNMUTE_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);

        return intent;
    }

    public static Intent createUseSpeakerCallIntent(int callbackId, int callId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_USE_SPEAKER_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);

        return intent;
    }

    public static Intent createUseEarpieceCallIntent(int callbackId, int callId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_USE_EARPIECE_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);

        return intent;
    }

    public static Intent createXFerCallIntent(int callbackId, int callId, String destination, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_XFER_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);
        intent.putExtra("destination", destination);

        return intent;
    }

    public static Intent createXFerReplacesCallIntent(int callbackId, int callId, int destinationCallId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_XFER_REPLACES_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);
        intent.putExtra("dest_call_id", destinationCallId);

        return intent;
    }

    public static Intent createRedirectCallIntent(int callbackId, int callId, String destination, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_REDIRECT_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);
        intent.putExtra("destination", destination);

        return intent;
    }

    public static Intent createDtmfCallIntent(int callbackId, int callId, String digits, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_DTMF_CALL);
        intent.putExtra("callback_id", callbackId);
        intent.putExtra("call_id", callId);
        intent.putExtra("digits", digits);

        return intent;
    }

    public static Intent createStartForegroundIntent(int callbackId, ReadableMap configuration, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_START_FOREGROUND);
        intent.putExtra("callback_id", callbackId);

        overrideIntentProps(intent, configuration);

        return intent;
    }

    public static Intent createStopForegroundIntent(int callbackId, Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.ACTION_STOP_FOREGROUND);
        intent.putExtra("callback_id", callbackId);

        return intent;
    }

    public static Intent createAppVisibleIntent(Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.EVENT_APP_VISIBLE);
        return intent;
    }
    public static Intent createAppHiddenIntent(Context context) {
        Intent intent = new Intent(context, PjSipService.class);
        intent.setAction(PjActions.EVENT_APP_HIDDEN);
        return intent;
    }


    private static void overrideIntentProps(Intent intent, ReadableMap configuration) {
        ReadableMapKeySetIterator it = configuration.keySetIterator();
        while (it.hasNextKey()) {
            String key = it.nextKey();

            switch (configuration.getType(key)) {
                case String:
                    intent.putExtra(key, configuration.getString(key));
                    break;
                case Number:
                    intent.putExtra(key, configuration.getInt(key));
                    break;
            }
        }
    }

}
