package app.revanced.twitter.patches.hook.patch.blue


import app.revanced.twitter.patches.hook.json.BaseJsonHook
import app.revanced.twitter.patches.hook.twifucker.TwiFucker
import org.json.JSONObject

object BlueHook : BaseJsonHook() {
    /**
     * Strips JSONObject from promoted ads.
     *
     * @param json The JSONObject.
     */
    override fun apply(json: JSONObject) = TwiFucker.hideBlueUsers(json)
}
