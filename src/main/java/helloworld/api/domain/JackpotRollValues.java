package helloworld.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "jackpot_roll_values")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class JackpotRollValues extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "daily_jackpot_rolls_id", referencedColumnName = "id")
    private DailyJackpotRolls dailyJackpotRolls;

    @Column(name = "value")
    private Integer value;
}
