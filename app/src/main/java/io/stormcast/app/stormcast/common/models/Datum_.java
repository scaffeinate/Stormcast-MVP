package io.stormcast.app.stormcast.common.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum_ implements Parcelable {

    public final static Parcelable.Creator<Datum_> CREATOR = new Creator<Datum_>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Datum_ createFromParcel(Parcel in) {
            Datum_ instance = new Datum_();
            instance.time = ((int) in.readValue((int.class.getClassLoader())));
            instance.summary = ((String) in.readValue((String.class.getClassLoader())));
            instance.icon = ((String) in.readValue((String.class.getClassLoader())));
            instance.precipIntensity = ((int) in.readValue((int.class.getClassLoader())));
            instance.precipProbability = ((int) in.readValue((int.class.getClassLoader())));
            instance.temperature = ((double) in.readValue((double.class.getClassLoader())));
            instance.apparentTemperature = ((double) in.readValue((double.class.getClassLoader())));
            instance.dewPoint = ((double) in.readValue((double.class.getClassLoader())));
            instance.humidity = ((double) in.readValue((double.class.getClassLoader())));
            instance.windSpeed = ((double) in.readValue((double.class.getClassLoader())));
            instance.windGust = ((double) in.readValue((double.class.getClassLoader())));
            instance.windBearing = ((int) in.readValue((int.class.getClassLoader())));
            instance.visibility = ((int) in.readValue((int.class.getClassLoader())));
            instance.cloudCover = ((double) in.readValue((double.class.getClassLoader())));
            instance.pressure = ((double) in.readValue((double.class.getClassLoader())));
            instance.ozone = ((double) in.readValue((double.class.getClassLoader())));
            instance.uvIndex = ((int) in.readValue((int.class.getClassLoader())));
            instance.precipType = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Datum_[] newArray(int size) {
            return (new Datum_[size]);
        }

    };
    @SerializedName("time")
    @Expose
    private int time;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("precipIntensity")
    @Expose
    private int precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private int precipProbability;
    @SerializedName("temperature")
    @Expose
    private double temperature;
    @SerializedName("apparentTemperature")
    @Expose
    private double apparentTemperature;
    @SerializedName("dewPoint")
    @Expose
    private double dewPoint;
    @SerializedName("humidity")
    @Expose
    private double humidity;
    @SerializedName("windSpeed")
    @Expose
    private double windSpeed;
    @SerializedName("windGust")
    @Expose
    private double windGust;
    @SerializedName("windBearing")
    @Expose
    private int windBearing;
    @SerializedName("visibility")
    @Expose
    private int visibility;
    @SerializedName("cloudCover")
    @Expose
    private double cloudCover;
    @SerializedName("pressure")
    @Expose
    private double pressure;
    @SerializedName("ozone")
    @Expose
    private double ozone;
    @SerializedName("uvIndex")
    @Expose
    private int uvIndex;
    @SerializedName("precipType")
    @Expose
    private String precipType;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(int precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public int getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(int precipProbability) {
        this.precipProbability = precipProbability;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public int getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(int windBearing) {
        this.windBearing = windBearing;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(time);
        dest.writeValue(summary);
        dest.writeValue(icon);
        dest.writeValue(precipIntensity);
        dest.writeValue(precipProbability);
        dest.writeValue(temperature);
        dest.writeValue(apparentTemperature);
        dest.writeValue(dewPoint);
        dest.writeValue(humidity);
        dest.writeValue(windSpeed);
        dest.writeValue(windGust);
        dest.writeValue(windBearing);
        dest.writeValue(visibility);
        dest.writeValue(cloudCover);
        dest.writeValue(pressure);
        dest.writeValue(ozone);
        dest.writeValue(uvIndex);
        dest.writeValue(precipType);
    }

    public int describeContents() {
        return 0;
    }

}
