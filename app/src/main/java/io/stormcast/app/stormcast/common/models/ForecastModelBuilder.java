package io.stormcast.app.stormcast.common.models;

import java.util.Date;

/**
 * Created by sudharti on 8/25/17.
 */

public class ForecastModelBuilder {
    protected String timezone, summary, icon, units, updatedAt;
    protected int currentTime, locationId;
    protected double temperature, apparentTemperature, humidity, windSpeed, pressure, visibility;

    public ForecastModelBuilder setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public ForecastModelBuilder setCurrentTime(Integer currentTime) {
        this.currentTime = currentTime;
        return this;
    }

    public ForecastModelBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public ForecastModelBuilder setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public ForecastModelBuilder setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    public ForecastModelBuilder setApparentTemperature(Double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
        return this;
    }

    public ForecastModelBuilder setHumidity(double humidity) {
        this.humidity = humidity;
        return this;
    }

    public ForecastModelBuilder setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public ForecastModelBuilder setPressure(double pressure) {
        this.pressure = pressure;
        return this;
    }

    public ForecastModelBuilder setVisibility(double visibility) {
        this.visibility = visibility;
        return this;
    }

    public ForecastModelBuilder setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public ForecastModelBuilder setUnits(String units) {
        this.units = units;
        return this;
    }

    public ForecastModelBuilder setLocationId(int locationId) {
        this.locationId = locationId;
        return this;
    }

    public ForecastModel build() {
        return new ForecastModel(this);
    }
}
