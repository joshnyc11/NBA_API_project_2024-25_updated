package com.nbaprojectJN.NBA.API.project.Player;

import jakarta.persistence.*;

@Entity
@Table(name = "player_per_game")
public class PlayerStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer season;

    private String league;

    private String player;

    @Column(name ="Player Reference")
    private String playerReference;

    private Integer age;

    private String tm;

    private String pos;

    private Integer g;

    private Integer gs;

    private Double mp;

    private Double fg;

    private Double fga;

    @Column(name = "FG%")
    private Double fgPct;

    @Column(name = "3P")
    private Double threeP;

    @Column(name = "3PA")
    private Double threePA;

    @Column(name = "3P%")
    private String threePPct;

    @Column(name = "2P")
    private Double twoP;

    @Column(name = "2PA")
    private Double twoPA;

    @Column(name = "2P%")
    private String twoPPct;

    @Column(name = "eFG%")
    private Double efgPct;

    @Column(name = "FTM")
    private Double ftm;

    @Column(name = "FTA")
    private Double fta;

    @Column(name = "FT%")
    private String ftPct;
    @Column(name = "OREB")
    private Double oreb;

    @Column(name = "DREB")
    private Double dreb;

    @Column(name = "TRB")
    private Double trb;

    @Column(name = "AST")
    private Integer ast;

    @Column(name = "STL")
    private Double stl;

    @Column(name = "BLK")
    private Double blk;

    @Column(name = "TOV")
    private Double tov;

    @Column(name = "PF")
    private Double pf;

    @Column(name = "PTS")
    private Double pts;

    public PlayerStats (){


    }

    public PlayerStats(
            Integer season,
            String league,
            String player,
            String playerReference,
            Integer age,
            String tm,
            String pos,
            Integer g,
            Integer gs,
            Double mp,
            Double fg,
            Double fga,
            Double fgPct,
            Double threeP,
            Double threePA,
            String threePPct,
            Double twoP,
            Double twoPA,
            String twoPPct,
            Double efgPct,
            Double ftm,
            Double fta,
            String ftPct,
            Double oreb,
            Double dreb,
            Double trb,
            Integer ast,
            Double stl,
            Double blk,
            Double tov,
            Double pf,
            Double pts
    ) {
        this.season = season;
        this.league = league;
        this.player = player;
        this.playerReference = playerReference;
        this.age = age;
        this.tm = tm;
        this.pos = pos;
        this.g = g;
        this.gs = gs;
        this.mp = mp;
        this.fg = fg;
        this.fga = fga;
        this.fgPct = fgPct;
        this.threeP = threeP;
        this.threePA = threePA;
        this.threePPct = threePPct;
        this.twoP = twoP;
        this.twoPA = twoPA;
        this.twoPPct = twoPPct;
        this.efgPct = efgPct;
        this.ftm = ftm;
        this.fta = fta;
        this.ftPct = ftPct;
        this.oreb = oreb;
        this.dreb = dreb;
        this.trb = trb;
        this.ast = ast;
        this.stl = stl;
        this.blk = blk;
        this.tov = tov;
        this.pf = pf;
        this.pts = pts;
    }



    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getSeason() { return season; }
    public void setSeason(Integer season) { this.season = season; }

    public String getLeague() { return league; }
    public void setLeague(String league) { this.league = league; }

    public String getPlayer() { return player; }
    public void setPlayer(String player) { this.player = player; }

    public String getPlayerReference() { return playerReference; }
    public void setPlayerReference(String playerReference) { this.playerReference = playerReference; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getTm() { return tm; }
    public void setTm(String tm) { this.tm = tm; }

    public String getPos() { return pos; }
    public void setPos(String pos) { this.pos = pos; }

    public Integer getG() { return g; }
    public void setG(Integer g) { this.g = g; }

    public Integer getGs() { return gs; }
    public void setGs(Integer gs) { this.gs = gs; }

    public Double getMp() { return mp; }
    public void setMp(Double mp) { this.mp = mp; }

    public Double getFg() { return fg; }
    public void setFg(Double fg) { this.fg = fg; }

    public Double getFga() { return fga; }
    public void setFga(Double fga) { this.fga = fga; }

    public Double getFgPct() { return fgPct; }
    public void setFgPct(Double fgPct) { this.fgPct = fgPct; }

    public Double getThreeP() { return threeP; }
    public void setThreeP(Double threeP) { this.threeP = threeP; }

    public Double getThreePA() { return threePA; }
    public void setThreePA(Double threePA) { this.threePA = threePA; }

    public String getThreePPct() { return threePPct; }
    public void setThreePPct(String threePPct) { this.threePPct = threePPct; }

    public Double getTwoP() { return twoP; }
    public void setTwoP(Double twoP) { this.twoP = twoP; }

    public Double getTwoPA() { return twoPA; }
    public void setTwoPA(Double twoPA) { this.twoPA = twoPA; }

    public String getTwoPPct() { return twoPPct; }
    public void setTwoPPct(String twoPPct) { this.twoPPct = twoPPct; }

    public Double getEfgPct() { return efgPct; }
    public void setEfgPct(Double efgPct) { this.efgPct = efgPct; }

    public Double getFtm() { return ftm; }
    public void setFtm(Double ftm) { this.ftm = ftm; }

    public Double getFta() { return fta; }
    public void setFta(Double fta) { this.fta = fta; }

    public String getFtPct() { return ftPct; }
    public void setFtPct(String ftPct) { this.ftPct = ftPct; }

    public Double getOreb() { return oreb; }
    public void setOreb(Double oreb) { this.oreb = oreb; }

    public Double getDreb() { return dreb; }
    public void setDreb(Double dreb) { this.dreb = dreb; }

    public Double getTrb() { return trb; }
    public void setTrb(Double trb) { this.trb = trb; }

    public Integer getAst() { return ast; }
    public void setAst(Integer ast) { this.ast = ast; }

    public Double getStl() { return stl; }
    public void setStl(Double stl) { this.stl = stl; }

    public Double getBlk() { return blk; }
    public void setBlk(Double blk) { this.blk = blk; }

    public Double getTov() { return tov; }
    public void setTov(Double tov) { this.tov = tov; }

    public Double getPf() { return pf; }
    public void setPf(Double pf) { this.pf = pf; }

    public Double getPts() { return pts; }
    public void setPts(Double pts) { this.pts = pts; }




}
