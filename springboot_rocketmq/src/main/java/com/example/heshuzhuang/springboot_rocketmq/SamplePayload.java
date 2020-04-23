package com.example.heshuzhuang.springboot_rocketmq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author heshuzhuang
 * @Date 2020/4/17 16:56
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SamplePayload implements Serializable {

	private int id;

	private String name;

	private long timestamp = System.currentTimeMillis();

	// === equals & hashcode ===

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SamplePayload that = (SamplePayload) o;
		return id == that.id &&
				timestamp == that.timestamp &&
				name.equals(that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, timestamp);
	}

}
